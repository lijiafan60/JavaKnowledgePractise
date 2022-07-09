package com.ljf.javaknowledgepractise;

import com.ljf.javaknowledgepractise.aoptest.Send;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaKnowledgePractiseApplicationTests {

    @Autowired
    public Send send;

    @Test
    void contextLoads() {
    }

    @Test
    void aopTest() {
        send.sendMessage(send + ": Hahaha");
    }
}
