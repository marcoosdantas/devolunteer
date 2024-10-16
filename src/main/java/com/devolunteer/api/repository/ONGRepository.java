package com.devolunteer.api.repository;

import com.devolunteer.api.entity.ONGEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ONGRepository extends MongoRepository<ONGEntity, String> {

}
