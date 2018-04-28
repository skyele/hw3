package hw3.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
public class HelloApplication {
	/* The entry of this project */
	public static void main(String[] args) {
		System.out.println("in main");
		SpringApplication.run(HelloApplication.class, args);
	}
}
