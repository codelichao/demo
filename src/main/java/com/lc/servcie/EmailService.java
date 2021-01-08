package com.lc.servcie;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {


    void sendSimpleMail(String senfTo,String title,String content);
}
