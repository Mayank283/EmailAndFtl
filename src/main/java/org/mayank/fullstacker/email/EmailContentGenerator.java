/**
 * 
 */
package org.mayank.fullstacker.email;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * @author agarwalm
 *
 */
@Component
public class EmailContentGenerator {

	@Autowired
	@Qualifier("ftlConfig")
	private Configuration freeMarkerConfiguration;

	public String generateEmailContent()
			throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("body", "Hello!!");
		model.put("signature","agarwal");

		Writer out = new OutputStreamWriter(System.out);
		Template template = freeMarkerConfiguration.getTemplate("email-template.ftl");
		template.process(model, out);
		String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
		return content;
	}
}
