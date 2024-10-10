package com.devolunteer.api.repository;

import com.devolunteer.api.entity.DeveloperEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeveloperRepository extends MongoRepository<DeveloperEntity, Long> {

}
