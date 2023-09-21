package com.yxs.api.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
public class UserInterfaceInfoServiceTest {
    @Resource
    UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void incokeCount() {
        boolean incokeCount = userInterfaceInfoService.incokeCount(1, 1);
        Assertions.assertTrue(incokeCount);

    }
}