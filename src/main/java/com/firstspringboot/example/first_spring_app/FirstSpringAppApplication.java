package com.firstspringboot.example.first_spring_app;

import com.firstspringboot.example.first_spring_app.model.Address;
import com.firstspringboot.example.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello all, welcome to first spring boot app!!!");


		// tight coupling
//		Employee emp1 = new Employee();
//		emp1.id =101;
//		emp1. name="Ajay";
//		emp1.email="ajay@gmail.com";
//		emp1.designation="developer";
//
//		Address adrs1= new Address();
//		adrs1.doorNo=888;
//		adrs1.streetName="old street";
//		adrs1.city="old city";
//
//		emp1.address= adrs1;
//
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is : "+adrs1);
//
//		adrs1.doorNo=555;
//		adrs1.streetName="new street";
//		adrs1.city="new city";
//		System.out.println("emp1 after adrs1 change is : "+emp1);
//		System.out.println("adrs1 after adrs1 change is : "+adrs1);

		// Dependency injection - loose coupling with setter injection
//		Employee emp2 = new Employee();
//		emp2.setId(102);
//		emp2.setName("Vijay");
//		emp2.setEmail("vijay@gmail.com");
//		emp2.setDesignation("tester");
//
//		Address adrs2 = new Address();
//		adrs2.setDoorNo(444);
//		adrs2.setStreetName("old street");
//		adrs2.setCity("old city");
//
//		emp2.setAddress(adrs2);
//
//		System.out.println("emp2 is : "+emp2);
//		System.out.println("adrs2 is : "+adrs2);
//
//		emp2.getAddress().setDoorNo(666);
//		emp2.getAddress().setStreetName("new street");
//		emp2.getAddress().setCity("new city");
//
//		System.out.println("emp2 after adrs2 change is : "+emp2);
//		System.out.println("adrs2 after adrs2 change is : "+adrs2);
//
//		// Dependency injection - loose coupling with constructor injection
//		Address adrs3 = new Address(333, "old street","old city");
//		Employee emp3 = new Employee(103,"Sanjay","sanjay@gmail.com","tester",adrs3);
//
//		System.out.println("emp3 is : "+emp3);
//		System.out.println("adrs3 is : "+adrs3);
//
//		emp3.getAddress().setDoorNo(222);
//		emp3.getAddress().setStreetName("new street");
//		emp3.getAddress().setCity("new city");
//
//		System.out.println("emp3 after adrs3 change is : "+emp3);
//		System.out.println("adrs3 after adrs3 change is : "+adrs3);
	}

}
