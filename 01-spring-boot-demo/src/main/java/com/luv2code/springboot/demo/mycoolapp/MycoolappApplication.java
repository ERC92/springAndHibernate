package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}

// Component scanning is recursive, common to have main in level above the rest of the code
// if work is split across multiple packages with different names, need to explicitly list 
// base packages e.g. @SpringBootApplication(scanBasePackages={"package1","package2",..})
