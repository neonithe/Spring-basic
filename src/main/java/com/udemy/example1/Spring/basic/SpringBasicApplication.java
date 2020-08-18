package com.udemy.example1.Spring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

	// -- The instructions for spring what to tell spring--
	//What are the beans?   -- @Component
	//What are the dependencies of a bean?   -- @Autowired
	//Where to search for beans  -- Spring boot scan the packages

	public static void main(String[] args) {



		//Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(SpringBasicApplication.class, args);

		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

		int result =
				binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);

	}

}
