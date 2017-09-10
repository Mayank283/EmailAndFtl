/**
 * 
 */
package org.mayank.fullstacker.controller;

import java.io.IOException;

import org.mayank.fullstacker.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * @author agarwalm
 *
 */
@RestController
public class EmailController {

	@Autowired
	EmailService emailService;

	
	@RequestMapping(value="/email",method=RequestMethod.GET)
	public void sendEmailNotification() throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException{
		String content = "Mayank";
		emailService.sendEmailToclient(content);
	}
	
}
