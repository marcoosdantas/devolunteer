package com.devolunteer.api.repository;

import com.devolunteer.api.entity.HelpRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HelpRequestRepository extends MongoRepository<HelpRequest, String> {
}