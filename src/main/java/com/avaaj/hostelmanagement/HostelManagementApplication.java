package com.avaaj.hostelmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HostelManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HostelManagementApplication.class, args);
	}

}
