package com.netlingo.notification.email.service;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.springframework.core.io.ClassPathResource;
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
		 
        //MimeMessageHelper helper = new MimeMessageHelper(message);
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        Map<String, Object> model = new HashMap<>();
        model.put("GSP_NAME", "Micro Gaming");
        model.put("FROM", "2019-06-20 21:31:08");
        model.put("TO", "2019-06-20 22:31:08");
        model.put("SIGNATURE", "http://aplus777.com");
        
        
         
        Template t = freemarkerConfig.getTemplate("maintenance-service.ftl");
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
        helper.setTo("oliverdelacruzlundag@gmail.com");
        helper.setText(html, true); // set to html
        helper.setSubject("Sample Email Notification Using Spring");
        helper.addInline("maintenance-services.jpg", new ClassPathResource("maintenance-services.jpg"));
        sender.send(message);
		
	}

}
