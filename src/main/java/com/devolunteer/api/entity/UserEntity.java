package com.devolunteer.api.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class UserEntity {
  @Id private String id;
  @Email
  @NotBlank
  private String email;
  @NotBlank
  private String username;
  @NotBlank
  private String name;
  @NotBlank
  private String password;
  private boolean isActive;
  private String shortDescription;
  @NotNull
  private UserType userType;
}
