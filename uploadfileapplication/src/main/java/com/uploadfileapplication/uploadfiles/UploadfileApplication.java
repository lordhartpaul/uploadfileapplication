package com.uploadfileapplication.uploadfiles;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.uploadfileapplication.uploadfiles.controller.UploadfileController;

@SpringBootApplication
@ComponentScan({"com.uploadfileapplication.uploadfiles", "com.uploadfileapplication.uploadfiles.controller"})
public class UploadfileApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new File(UploadfileController.uploadDirectory).mkdir();
		SpringApplication.run(UploadfileApplication.class, args);

	}

}
