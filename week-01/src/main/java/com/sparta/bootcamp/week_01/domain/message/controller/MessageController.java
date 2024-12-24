package com.sparta.bootcamp.week_01.domain.message.controller;

import com.sparta.bootcamp.week_01.domain.message.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

  private final MessageService messageService;

  public MessageController(MessageService messageService) {
    this.messageService = messageService;
  }

  @GetMapping
  public ResponseEntity<?> findMessage() {
    return ResponseEntity.ok("message");
  }
}
