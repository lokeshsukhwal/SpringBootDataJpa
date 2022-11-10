package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.lokesh.service.ExportExclService;
import com.app.lokesh.service.ExportPdfService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ExportExclService exclService;

	@Autowired
	private ExportPdfService pdfService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(exclService);
		System.out.println(pdfService);
	}

}
