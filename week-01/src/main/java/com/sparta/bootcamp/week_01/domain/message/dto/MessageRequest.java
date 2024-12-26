package com.sparta.bootcamp.week_01.domain.message.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class MessageRequest {

  @NotNull(message = "title 필수 값입니다.")
  private String title;
  @NotBlank(message = "message cannot be blank")
  @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
  private String message;
  private LocalDateTime timestamp;

}
