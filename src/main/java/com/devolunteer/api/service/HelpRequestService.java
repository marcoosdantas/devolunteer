package com.devolunteer.api.service;

import com.devolunteer.api.entity.DeveloperEntity;
import com.devolunteer.api.entity.HelpRequest;
import com.devolunteer.api.repository.HelpRequestRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class HelpRequestService {
  private final HelpRequestRepository helpRequestRepository;
  private final DeveloperService developerService;

  public HelpRequest createHelpRequest(HelpRequest helpRequest) {
    helpRequest.generateId();
    return helpRequestRepository.save(helpRequest);
  }

  public List<HelpRequest> findAll() {
    return helpRequestRepository.findAll();
  }

  public HelpRequest assignDeveloperToHelpRequest(String helpRequestId, String developerId) {
    HelpRequest helpRequest =
        helpRequestRepository
            .findById(helpRequestId)
            .orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada"));
    DeveloperEntity developer = developerService.findById(developerId);
    helpRequest.setAssignedDeveloper(developer);
    helpRequest.setStatus("IN_PROGRESS");
    return helpRequestRepository.save(helpRequest);
  }
}
