package com.rinku.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication( scanBasePackages = { "com.rinku.address" } )
@EntityScan( value = { "com.rinku.address" } )
@EnableJpaRepositories( value = { "com.rinku.address" } )
public class AddressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}

}
