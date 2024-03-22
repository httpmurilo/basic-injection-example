package io.httpmurilo.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class InjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectionApplication.class, args);
	}

}
