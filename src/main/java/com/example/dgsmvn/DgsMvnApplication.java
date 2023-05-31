package com.example.dgsmvn;

import com.netflix.graphql.dgs.DgsDataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DgsMvnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DgsMvnApplication.class, args);
//		Arrays.asList(context.getBeanDefinitionNames()).stream().forEach(a -> System.out.println("Bean : "+a));
	}

}
