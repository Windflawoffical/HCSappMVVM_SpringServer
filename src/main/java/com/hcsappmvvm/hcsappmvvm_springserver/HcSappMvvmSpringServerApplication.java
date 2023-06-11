package com.hcsappmvvm.hcsappmvvm_springserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hcsappmvvm.hcsappmvvm_springserver")
@EnableAutoConfiguration
public class HcSappMvvmSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcSappMvvmSpringServerApplication.class, args);
	}

}
