package com.notfication;

import com.notfication.model.NotificationTemplate;
import com.notfication.repo.NotificationFunctions;
//import com.notfication.repo.NotificationFunctionsImplementation;
import com.notfication.services.NotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.Notification;
import java.util.ArrayList;

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {

		SpringApplication.run(NotificationApplication.class, args);

	}
	
}
