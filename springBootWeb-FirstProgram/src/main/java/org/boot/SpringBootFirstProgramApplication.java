package org.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


//@ImportResource(locations = {"classpath:application-user.xml"}) 
@SpringBootApplication
//@ComponentScan(basePackages = {"org.boot.Mapper"})
public class SpringBootFirstProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstProgramApplication.class, args);
	}

}
