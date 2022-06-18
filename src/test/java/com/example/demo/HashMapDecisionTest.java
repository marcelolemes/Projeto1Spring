package com.example.demo;

import com.example.demo.hacks.HashMapDecision;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class HashMapDecisionTest {
    @Test
    public void testaHash_DeveTerSucesso(){
        String result = HashMapDecision.decision(21);
        Assertions.assertEquals("Not Found",result);
    }

    @Test
    public void testaHash_DeveFalhar(){
        String result = HashMapDecision.decision(20);
        Assertions.assertNotEquals("Not Found",result);
    }

}
