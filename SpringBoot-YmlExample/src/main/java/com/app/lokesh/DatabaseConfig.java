package com.app.lokesh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@ConfigurationProperties(prefix = "com.app")
@Data
public class DatabaseConfig {
	private Integer port;
	private String host;
	private String username;
	private String password;
}
