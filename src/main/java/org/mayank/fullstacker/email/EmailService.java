package org.mayank.fullstacker.email;

import java.io.IOException;

import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * @author agarwalm
 *
 */
public interface EmailService {

	/**
	 * Method to send email to client
	 * @throws IOException 
	 * @throws ParseException 
	 * @throws MalformedTemplateNameException 
	 * @throws TemplateNotFoundException 
	 * @throws TemplateException 
	 */
	public void sendEmailToclient(String content) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException;
}
