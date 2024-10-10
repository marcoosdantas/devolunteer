package com.devolunteer.api.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "devs")
public class DeveloperEntity extends UserEntity{
  @NotBlank
  private String specialty;
  private String seniority;
}
