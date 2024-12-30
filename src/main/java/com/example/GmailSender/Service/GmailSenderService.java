package com.example.GmailSender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.GmailSender.Model.GmailSender;

@Service
public class GmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(GmailSender emailSender) {
        SimpleMailMessage message = new SimpleMailMessage();
        
  
        message.setTo(emailSender.getTo());
        message.setSubject(emailSender.getSubject());
        message.setText(emailSender.getMessage());
        
        javaMailSender.send(message);
    }
}
