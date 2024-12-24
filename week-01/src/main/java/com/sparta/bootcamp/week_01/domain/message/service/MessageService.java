package com.sparta.bootcamp.week_01.domain.message.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

  public String getMessage() {
    return "Hello, Spring IoC and DI!";
  }
}
