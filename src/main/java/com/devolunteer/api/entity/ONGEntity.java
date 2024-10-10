package com.devolunteer.api.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ongs")
public class ONGEntity extends UserEntity {
  @NotBlank
  private String activityArea;
}