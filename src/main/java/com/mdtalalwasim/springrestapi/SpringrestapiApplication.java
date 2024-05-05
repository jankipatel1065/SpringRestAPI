package com.mdtalalwasim.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class SpringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestapiApplication.class, args);
		System.out.println("Hello");
	}

}
