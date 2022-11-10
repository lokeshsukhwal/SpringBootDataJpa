package com.app.lokesh.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component
@Profile({"default","uat"})
public class ExportExclService {
	@Value("#{new java.util.Random().nextInt()}")
	private Integer code;
	
	@Value(".csv")
	private String format;
}
