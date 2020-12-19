package com.mailandaynx.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class AynxService {
    public void hello(){
        try{
            Thread.sleep(300);
        }catch (Exception e)
        {
            System.out.println("错误");
        }
        System.out.println("ok");

    }
}
