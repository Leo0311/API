package com.registros.registro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class RegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
	}


}
