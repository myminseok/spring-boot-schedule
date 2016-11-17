package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(fixedRate=5000)
    public void test(){
        logger.info("fixedRate test:"+ System.currentTimeMillis());
    }

    @Scheduled(cron="*/10 * * * * *")
    public void cron(){
        logger.info("cron test:"+ System.currentTimeMillis());
    }
}
