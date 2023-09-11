package com.cooperzhu.aliyuncdnservice.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CdnCheckTaskTests {

    @Autowired
    private CdnCheckTask cdnCheckTask;

    @Test
    void testStart() {
        cdnCheckTask.start();
    }
}
