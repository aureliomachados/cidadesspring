package com.guedesit.cidadesspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class CidadesspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CidadesspringApplication.class, args);
	}

}
