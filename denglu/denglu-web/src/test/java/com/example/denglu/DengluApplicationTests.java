package com.example.denglu;

import com.example.denglu.dao.LoginMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DengluApplicationTests {

    @Autowired
    LoginMapper loginMapper;

    @Test
    void contextLoads() {
        System.out.println(loginMapper.findone("zhangsan"));
    }

}
