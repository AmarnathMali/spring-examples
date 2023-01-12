package com.jee.spring;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SendMailBean implements SendMail{

	private MailSender mailsender;

	public void setMailsender(MailSender mailsender) {
	this.mailsender = mailsender;
	}

	public void sendMail(String from, String to, String subject, String body) {
		// TODO Auto-generated method stub
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(from);
		msg.setTo(to);
		msg.setSubject(subject);
		msg.setText(body);
		mailsender.send(msg);

	}
}
