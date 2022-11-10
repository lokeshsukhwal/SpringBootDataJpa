package com.app.lokesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements CommandLineRunner {
	@Autowired
	private EmailConfigration emailConfigration;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(emailConfigration);
	}
}
