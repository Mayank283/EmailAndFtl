/**
 * 
 */
package org.mayank.fullstacker.freemarkar.configuration;

import java.io.File;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author agarwalm
 *
 */

@Configuration
public class FreemarkerConfiguration {

	@Bean(name="ftlConfig")
	public freemarker.template.Configuration freeMarkerConfiguration() throws IOException {
		freemarker.template.Configuration freemarkerConfiguration = new freemarker.template.Configuration(
				freemarker.template.Configuration.VERSION_2_3_25);
		freemarkerConfiguration
				.setDirectoryForTemplateLoading(new File("C:/Users/agarwalm/Migrate/fullstacker/src/main/resources"));
		freemarkerConfiguration.setLogTemplateExceptions(false);
		return freemarkerConfiguration;
	}
}