package com.stackbuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
  public static void main(String[] args) {
    List<User> users = Arrays.asList(
      // admins
      new User("Bruce", "Banner", true, true),
      new User("Clinton", "Barton", true, false),
      new User("Natasha", "Romanoff", true, true),
      new User("Steve", "Rogers", true, true),
      new User("Thor", "Odisen", true, true),
      new User("Tony", "Stark", true, true),
      // members
      new User("Peter", "Parker", false, false),
      new User("Stephen", "Strange", false, true)
    );

    List<User> enabledUsers = users.stream()
      .filter(user -> user.isEnabled())
      .collect(Collectors.toList());

    List<Row> rows = enabledUsers.stream()
      .map(user -> {
        Row row = new Row();
        row.addColumn(new Column(user.getFirstName() + " " + user.getLastName()));
        String role = user.isAdmin() ? "ADMIN" : "MEMBER";
        row.addColumn(new Column(role));
        return row;
      })
      .collect(Collectors.toList());

    Table table = new Table();
    table.addRows(rows);
    table.render();
  }
}
