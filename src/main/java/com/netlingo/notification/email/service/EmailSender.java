package com.netlingo.notification.email.service;

public interface EmailSender {

	public void sendEmail(String jsonBody) throws Exception;
}
