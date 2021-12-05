package com.bechir.peintures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.bechir.peintures.entities.Peinture;

@SpringBootApplication
public class PeinturesApplication {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(PeinturesApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Peinture.class);
	}

}
