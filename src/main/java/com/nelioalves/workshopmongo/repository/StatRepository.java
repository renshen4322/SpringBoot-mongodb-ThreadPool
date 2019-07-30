package com.nelioalves.workshopmongo.repository;

import com.nelioalves.workshopmongo.domain.AllocateStat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends MongoRepository<AllocateStat, String> {
}
