package com.springboot.h2_demo;

import com.springboot.h2_demo.model.Book;
import com.springboot.h2_demo.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class H2DemoApplication {

//	@Autowired
//	BookRepo bookRepo;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(H2DemoApplication.class, args);
		Object dataSource = context.getBean("dataSource");
		System.out.println(dataSource);

	}

//	@Bean
//	CommandLineRunner commandLineRunner(){
//		return args -> {
//			bookRepo.save(new Book(null, "Java for beginners", 1300, "Fitz Mre"));
//		};
//	}

}
