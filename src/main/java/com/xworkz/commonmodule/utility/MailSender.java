package com.xworkz.commonmodule.utility;

import java.util.Properties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailSender {
public static void main(String[] args)   {

	JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
	mailSenderImpl.setHost("smtp.gmail.com");
	mailSenderImpl.setPort(587);
	mailSenderImpl.setUsername("unstoppabledk2d@gmail.com");
	mailSenderImpl.setPassword("ganeshdk2d");
	
	Properties javaMailProperties = new Properties();
	javaMailProperties.put("mail.smtp.starttls.enable", "true");
	javaMailProperties.put("mail.smtp.auth", "true");
	javaMailProperties.put("mail.transport.protocol", "smtp");
	javaMailProperties.put("mail.debug", "true");
	javaMailProperties.put("mail.smtp.ssl.trust","*");
	
	mailSenderImpl.setJavaMailProperties(javaMailProperties);
	
	String []bccs = {"soubhagya.xworkz@gmail.com","jagapurmadhu143@gmail.com"};
	SimpleMailMessage message = new SimpleMailMessage();
	message.setFrom("unstoppabledk2d@gmail.com");
	message.setTo("soubhagya.xworkz@gmail.com");
	message.setBcc(bccs);
	message.setSubject("Demo Mail Sender");
	message.setText("welcome to all \n I am unstoppable \n");
	
	mailSenderImpl.send(message);
}
}
