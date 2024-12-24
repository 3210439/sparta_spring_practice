package com.sparta.bootcamp.week_01.common;

public class ApiResponse<T> {

  private final Boolean result;
  private final String error;
  private final String errorMessage;
  private final T message;

  public ApiResponse(Boolean result, String error, String errorMessage, T message) {
    this.result = result;
    this.error = error;
    this.errorMessage = errorMessage;
    this.message = message;
  }
}
