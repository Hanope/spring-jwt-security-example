package com.example.polls.payload;

public class UserIdentiyAvailability {

  private Boolean available;

  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public UserIdentiyAvailability(Boolean available) {

    this.available = available;
  }
}
