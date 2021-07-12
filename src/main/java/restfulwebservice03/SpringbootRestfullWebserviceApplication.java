package restfulwebservice03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestfullWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfullWebserviceApplication.class, args);
	}

}
/*
	Form-based Authentication
	1) How to create Form-Based Authentication
	Answer: Add following dependency into pom.xml
	
	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
	</dependency>
	
	Note: When you add dependency and run the application, SpringBoot will generate a 
		password for you and username will "user" everytime. By using generated password 
		and "user" as username you can access to database
	
	2) What are the cons of Form-Based Authentication?
		a) When user uses username and password once, user will be able to use all request
		methods, this is not good.
		b) Without logging out, the application might be logged in constantly.
		c) User should enter username and password manually.
		
	3) How to create your own username and password?
		Go to application.properties file and add the followings
		
		spring.security.user.name=
		spring.security.user.password=
		
	4) Get Request method has less security than the others in SpringBoot


*/