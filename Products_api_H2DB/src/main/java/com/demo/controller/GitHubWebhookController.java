package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubWebhookController 
{
     
	@PostMapping("/github-webhook")
    public ResponseEntity<String> handleGitHubPush(@RequestBody String payload,
                                                   @RequestHeader("X-GitHub-Event") String eventType,
                                                   @RequestHeader("X-GitHub-Delivery") String deliveryId)
	{
        System.out.println("Received GitHub webhook:");
        System.out.println("Event: " + eventType);
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Payload: " + payload);

        return ResponseEntity.ok("Received");
    }
}

