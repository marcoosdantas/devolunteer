package com.devolunteer.api.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class UserEntity {

  @Id private String id;

  @Email
  @NotBlank
  @Indexed(unique = true)
  private String email;

  @NotBlank
  @Indexed(unique = true)
  private String username;

  @NotBlank private String name;

  @NotBlank private String password;

  private boolean isActive = false;

  private String shortDescription;

  @NotNull private UserType userType;
}
