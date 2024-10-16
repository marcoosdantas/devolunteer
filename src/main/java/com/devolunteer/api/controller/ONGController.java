package com.devolunteer.api.controller;

import com.devolunteer.api.entity.ONGEntity;
import com.devolunteer.api.service.ONGService;
import jakarta.validation.Valid;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ong")
@Validated
@RequiredArgsConstructor
public class ONGController {
  private final ONGService ONGService;

  @PostMapping
  public ResponseEntity<ONGEntity> createDev(@Valid @RequestBody ONGEntity ong) {
    ONGService.save(ong);
    return new ResponseEntity<>(ong, HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ONGEntity> findById(@PathVariable String id) {
    Optional<ONGEntity> ongResponse = ONGService.findById(id);
    return ongResponse
        .map(ong -> new ResponseEntity<>(ong, HttpStatus.OK))
        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
}
