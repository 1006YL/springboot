package com.mailandaynx.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchduleService {
    @Scheduled(cron = "0/2 2 12 * * ?")
    public void hello(){
        System.out.println("hello");
    }
}
