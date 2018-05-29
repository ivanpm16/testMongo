package com.example.testMongo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.testMongo.Model.Incident;

public interface Repository extends MongoRepository<Incident,String> {
	
	public Incident findById(String id);
	public List<Incident> findByLine(String line);
	public Incident save(Incident incident);
}
