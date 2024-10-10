package com.devolunteer.api.controller;

import com.devolunteer.api.entity.DeveloperEntity;
import com.devolunteer.api.service.DeveloperService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/devs")
@Validated
@RequiredArgsConstructor
public class DeveloperController {
    private final DeveloperService developerService;

    @PostMapping
    public ResponseEntity<DeveloperEntity> createDev(@Valid @RequestBody DeveloperEntity dev) {
        developerService.save(dev);
        return new ResponseEntity<>(dev, HttpStatus.CREATED);
    }
}