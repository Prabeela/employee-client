package io.pivotal.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import io.pivotal.controller.EmployeeController;

@SpringBootApplication
@ComponentScan(basePackageClasses=EmployeeController.class)
public class EmployeeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeClientApplication.class, args);
	}
}
