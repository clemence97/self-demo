package com.example.excel;

import com.test.Function;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
@SpringBootTest()
@Slf4j
class ExcelApplicationTests {


    @Resource
    private Function function2;

    @Test
    public void test (){
        function2.print();
    }
}
