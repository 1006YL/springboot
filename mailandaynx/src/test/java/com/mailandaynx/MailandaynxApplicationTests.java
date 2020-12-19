package com.mailandaynx;

import com.mailandaynx.service.AynxService;
import com.mailandaynx.service.SchduleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;

@SpringBootTest
class MailandaynxApplicationTests {
    @Autowired
    AynxService aynxService=new AynxService();
    @Autowired
    SchduleService schduleService=new SchduleService();
    @Autowired
    public JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {
        //邮件设置1：一个简单的邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("通知-明天来狂神这听课");
        message.setText("今晚7:30开会");
        message.setTo("1006779381@qq.com");
        message.setFrom("1006779381@qq.com");
        mailSender.send(message);
        ArrayList a=new ArrayList();

    }
}
