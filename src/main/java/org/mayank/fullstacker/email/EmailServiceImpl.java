/**
 * 
 */
package org.mayank.fullstacker.email;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * @author agarwalm
 *
 */
@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private EmailContentGenerator emailContentGenerator;

	@Override
	public void sendEmailToclient(String content) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {

		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		String cont = emailContentGenerator.generateEmailContent();

		try {
			helper.setTo("codemayank@gmail.com");
			helper.setSubject("Email for Contacting ");
			helper.setText(cont, true);;
		} catch (MessagingException e) {
			System.err.println(e.getMessage());
		}
		javaMailSender.send(message);
	}
}