package com.stackbuilders;

public class Column {
  private final String content;

  public Column(String content) {
    this.content = content;
  }

  public void render() {
    System.out.print(content);
  }
}
