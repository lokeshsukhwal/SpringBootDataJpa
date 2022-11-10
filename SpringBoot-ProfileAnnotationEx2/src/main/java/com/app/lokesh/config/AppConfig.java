package com.app.lokesh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.app.lokesh.service.ExportPdfService;

@Configuration
public class AppConfig {

	@Bean
	@Profile({"default","qa"})
	public ExportPdfService pdf() {
		ExportPdfService pService = new ExportPdfService();
		pService.setFileExt(".pdf");
		pService.setFtype("document");
		return pService;
	}
}
