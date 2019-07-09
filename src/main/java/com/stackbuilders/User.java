package com.stackbuilders;

public class User {
  private final String firstName;
  private final String lastName;
  private final boolean enabled;

  public User(String firstName, String lastName, boolean enabled) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.enabled = enabled;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public boolean isEnabled() {
    return this.enabled;
  }
}
