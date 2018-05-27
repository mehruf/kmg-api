package com.kmg.main;

import com.kmg.config.ControllerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ControllerConfig.class)
public class KmgApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmgApplication.class, args);
	}
}
