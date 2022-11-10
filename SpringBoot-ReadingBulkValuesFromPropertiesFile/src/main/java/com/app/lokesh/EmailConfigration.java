package com.app.lokesh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "my.app")
@Data
public class EmailConfigration {
	private String host;
	private int port;
	private boolean active;
	private String user;

}
