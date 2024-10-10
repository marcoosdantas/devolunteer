package com.devolunteer.api.service;

import com.devolunteer.api.entity.DeveloperEntity;
import com.devolunteer.api.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeveloperService {
    private final DeveloperRepository developerRepository;
    public void save(DeveloperEntity developerEntity){
        developerRepository.save(developerEntity);
    }
}
