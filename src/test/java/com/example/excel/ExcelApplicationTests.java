package com.example.excel;

import com.test.Function;
import com.test.FunctionImpl;
import com.test.TestApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@Slf4j
class ExcelApplicationTests {


    @Resource
    private Function function2;

    @Test
    public void test (){
        function2.print();
    }

}
