package org.assoSportive;

import org.assoSportive.repository.GymnaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
//@EnableMongoRepositories(basePackageClasses = GymnaseRepository.class)
public class AssoSportiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssoSportiveApplication.class, args);
	}

}
