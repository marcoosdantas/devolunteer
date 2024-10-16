package com.devolunteer.api.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "helpRequests")
public class HelpRequest {

  @Id private String id;

  private String title;
  private String description;
  private LocalDateTime createdAt = LocalDateTime.now();

  @DBRef private ONGEntity ong;
  @DBRef private DeveloperEntity assignedDeveloper;

  private String status = "PENDING"; // (ex: "PENDING", "IN_PROGRESS", "COMPLETED")

  public void generateId() {
    this.id = UUID.randomUUID().toString();
  }
}
