package com.netlingo.notification.email.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.netlingo.notification.email.service.EmailService;

@RestController
public class EmailNotificationController {
	
	private static Logger log = LoggerFactory.getLogger(EmailNotificationController.class);

	private EmailService emailService;

	public EmailNotificationController(EmailService emailService) {
		super();
		this.emailService = emailService;
	}

	@PostMapping("/maintenance/email")
    @ResponseBody
    public String email(@RequestBody String jsonBody) {
        try {
        	emailService.sendEmail(jsonBody);
            return "Email Sent!";
        } catch (Exception ex) {
            return "Error in sending email: " + ex;
        }
    }
}
