package com.example.testMongo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testMongo.Model.Incident;
import com.example.testMongo.Repository.Repository;

@SpringBootApplication
public class TestMongoApplication implements CommandLineRunner {

	@Autowired
	public Repository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestMongoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Incident incident = new Incident();
		
		incident.setClose(false);
		incident.setElement("lift");
		incident.setLine("Linea 1");
		incident.setStation("Atocha");
		incident.setDate(LocalDateTime.now());
		
		repository.save(incident);
		System.out.println("La incidencia ha sido notificada");
		
	}
}
