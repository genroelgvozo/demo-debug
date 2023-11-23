package com.example.demo;

public class SomeException extends RuntimeException {

  private int value;

  public SomeException(int value) {
    this.value = value;
  }

  public SomeException(int value, Throwable cause) {
    super(cause);
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
