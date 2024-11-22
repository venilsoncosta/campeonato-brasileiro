package com.venilson.campeonato_brasileiro;

import com.venilson.campeonato_brasileiro.entities.Clube;
import com.venilson.campeonato_brasileiro.repositories.ClubeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CampeonatoBrasileiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampeonatoBrasileiroApplication.class, args);
	}

}
