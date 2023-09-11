package com.cooperzhu.aliyuncdnservice;

import com.cooperzhu.aliyuncdnservice.task.CdnCheckTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableScheduling
public class AliyunCdnServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliyunCdnServiceApplication.class, args);
    }

    @Component
    class CZApplicationRunner implements ApplicationRunner {
        @Autowired
        private CdnCheckTask cdnCheckTask;
        @Override
        public void run(ApplicationArguments args) throws Exception {
            cdnCheckTask.start();
        }
    }
}
