package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudensystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=	SpringApplication.run(StudensystemApplication.class, args);

	}

}
