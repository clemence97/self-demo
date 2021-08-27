package com.example.excel;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;


public class PingYinUtil {

        /**
         * 汉字转为拼音
         * @param chinese
         * @return
         */
        public static String ToPinyin(String chinese){
            String pinyinStr = "";
            char[] newChar = chinese.toCharArray();
            HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
            defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
            defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
            for (int i = 0; i < newChar.length; i++) {
                if (newChar[i] > 128) {
                    try {
                        pinyinStr += PinyinHelper.toHanyuPinyinStringArray(newChar[i], defaultFormat)[0];
                    } catch (BadHanyuPinyinOutputFormatCombination e) {
                        e.printStackTrace();
                    }
                }else{
                    pinyinStr += newChar[i];
                }
            }
            return pinyinStr;
        }

        /**
         * 首字母大写
         * @param chinese
         * @return
         */
        public static String ToFirstChar(String chinese){
            String pinyinStr = "";
            char[] newChar = chinese.toCharArray();  //转为单个字符
            HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
            defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
            defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
            for (int i = 0; i < newChar.length; i++) {
                if (newChar[i] > 128) {
                    try {
                        pinyinStr += PinyinHelper.toHanyuPinyinStringArray(newChar[i], defaultFormat)[0].charAt(0);
                    } catch (BadHanyuPinyinOutputFormatCombination e) {
                        e.printStackTrace();
                    }
                }else{
                    pinyinStr += newChar[i];
                }
            }
            return pinyinStr;
        }


}
