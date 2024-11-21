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

	@Bean
	public CommandLineRunner LoadData(ClubeRepository clubeRepository) {
		return args -> {
			Clube clube1 = new Clube(null, "São paulo", "Morumbi", 0, 0,
					0, 0, 0, 0);

			Clube clube2 = new Clube(null, "Flamengo", "Maracanã", 0, 0,
					0, 0, 0, 0);

			Clube clube3 = new Clube(null, "Corinthians", "Neo Quimica arena", 0, 0,
					0, 0, 0, 0);

			clubeRepository.save(clube1);
			clubeRepository.save(clube2);
			clubeRepository.save(clube3);
		};
	}
}
