package com.whistlejs.crawler.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CrawlingScheduler {
    private final static String URL = "";

    @Scheduled(fixedDelay = 1000 * 60)
    public void getEventList() {
        System.out.println("Events");
    }
}
