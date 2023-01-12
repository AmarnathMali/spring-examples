package com.jee.spring;

public interface SendMail {

	public void sendMail(String from,String to, String subject,String body);
}
