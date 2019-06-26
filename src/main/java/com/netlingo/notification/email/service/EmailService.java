package com.netlingo.notification.email.service;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;

@Service
public class EmailService implements EmailSender {

	private JavaMailSender sender;
    private Configuration freemarkerConfig;
    
    
    
	public EmailService(JavaMailSender sender, Configuration freemarkerConfig) {
		super();
		this.sender = sender;
		this.freemarkerConfig = freemarkerConfig;
	}



	@Override
	public void sendEmail(String jsonBody) throws Exception {
		
		MimeMessage message = sender.createMimeMessage();
		 
        MimeMessageHelper helper = new MimeMessageHelper(message);
 
        Map<String, Object> model = new HashMap<>();
        model.put("GSP_NAME", "Micro Gaming");
        model.put("FROM", "2019-06-20 21:31:08");
        model.put("TO", "2019-06-20 22:31:08");
         
        // set loading location to src/main/resources
        // You may want to use a subfolder such as /templates here
        freemarkerConfig.setClassForTemplateLoading(this.getClass(), "/");
         
        Template t = freemarkerConfig.getTemplate("regular-maintenance.ftl");
        String text = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
 
        helper.setTo("gspapi1@gmail.com");
        helper.setText(text, true); // set to html
        helper.setSubject("Sample Email Notification Using Spring");
 
        sender.send(message);
		
	}

}
