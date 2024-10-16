package com.devolunteer.api.controller;

import com.devolunteer.api.entity.HelpRequest;
import com.devolunteer.api.service.HelpRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/help-requests")
public class HelpRequestController {

    @Autowired
    private HelpRequestService helpRequestService;

    @PostMapping
    public ResponseEntity<HelpRequest> createHelpRequest(@RequestBody HelpRequest helpRequest) {
        HelpRequest createdRequest = helpRequestService.createHelpRequest(helpRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRequest);
    }
    @GetMapping
    public ResponseEntity<List<HelpRequest>> getAll(){
        return ResponseEntity.ok(helpRequestService.findAll());
    }
    @PutMapping("/{helpRequestId}/assign-developer/{developerId}")
    public ResponseEntity<HelpRequest> assignDeveloper(@PathVariable String helpRequestId, @PathVariable String developerId) {
        HelpRequest updatedHelpRequest = helpRequestService.assignDeveloperToHelpRequest(helpRequestId, developerId);
        return ResponseEntity.ok(updatedHelpRequest);
    }
}
