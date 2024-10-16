package com.devolunteer.api.service;

import com.devolunteer.api.entity.ONGEntity;
import com.devolunteer.api.repository.ONGRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ONGService {
  private final ONGRepository ongRepository;

  public void save(ONGEntity ongEntity) {
    ongRepository.save(ongEntity);
  }

  public Optional<ONGEntity> findById(String id) {
    return ongRepository.findById(id);
  }
}
