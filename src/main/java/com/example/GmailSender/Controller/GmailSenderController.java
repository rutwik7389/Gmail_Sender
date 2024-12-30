package com.example.GmailSender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.GmailSender.Model.GmailSender;
import com.example.GmailSender.Service.GmailSenderService;

@Controller
public class GmailSenderController {

	@Autowired
	GmailSenderService gms;
	
	@GetMapping("/")
	public String emailform() {
		return "GmailSenderForm";
	}
	
	
	
	@PostMapping("/sendmail")
	@ResponseBody
	public String sendMail(@ModelAttribute  GmailSender emailSender) {
		gms.sendMail(emailSender);
		return "Message Sent Successfully";
	}
} 