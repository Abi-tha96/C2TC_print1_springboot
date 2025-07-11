package com.tnsif.Shoping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ShopingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(ShopingApplication.class, args);
		Customer c=var.getBean(Customer.class);
		
		c.customerorder();
	}

}
