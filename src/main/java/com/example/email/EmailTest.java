package com.example.email;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

import javax.activation.DataHandler;
import java.io.File;
import java.util.Properties;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;

@Slf4j
public class EmailTest {


    //正文 + 附件
    public static void sendEmail(String title, String to, File file, String nickname, String content) {
        try {
            Properties prop = new Properties();
            prop.setProperty("mail.transport.protocol", "smtp");
            prop.setProperty("mail.smtp.host", "smtphz.qiye.163.com");
            prop.setProperty("mail.smtp.port", "25");
            prop.setProperty("mail.smtp.auth", "true");
            prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            prop.setProperty("mail.smtp.socketFactory.port", "994");
            Authenticator authenticator = new PopAuthenticator("xinbianli_server@meichai.in", "Wzj@qwer2323");
            javax.mail.Session session = Session.getInstance(prop, authenticator);
            Message msg = new MimeMessage(session);
            String nick = MimeUtility.encodeText(nickname);
            msg.setFrom(new InternetAddress(nick + " <" + "xinbianli_server@meichai.in" + ">"));
            msg.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(to));
            msg.setSubject(title);

            MimeMultipart mm = new MimeMultipart();
            //附件
            MimeBodyPart attachment = new MimeBodyPart();
            DataHandler dh2 = new DataHandler(new FileDataSource(file));
            attachment.setDataHandler(dh2);
            attachment.setFileName(MimeUtility.encodeText(dh2.getName()));
            mm.addBodyPart(attachment);
            mm.setSubType("mixed");
            //正文
            BodyPart text = new MimeBodyPart();
            text.setContent(content, "text/html;charset=UTF-8");
            mm.addBodyPart(text);
            msg.setContent(mm);
            Transport.send(msg);
        }catch (Exception e){
            log.info(ExceptionUtils.getStackTrace(e));
        }

    }
}
