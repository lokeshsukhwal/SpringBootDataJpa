/* to run using maven command [clean,build]
 * D:\eclipse-workspace\spring-boot\springboot-ProfilesEx\target>
 * java -jar springboot-ProfilesEx-1.0.jar [to run from cmd]
 * --spring.profiles.active=prod or qa [to activate profile using cmd or run as-->run configuration 
 *  -->arguments-->enter the profile name and apply -->run]
 */
package com.app.lokesh.dbcon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "com.app")
@Data
public class DatabaseCon {
	private String driver;
	private String url;
	private String username;
	private String password;
}
