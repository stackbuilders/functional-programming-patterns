package com.stackbuilders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
      new User("Stephen", "Strange", false, true),
      new User(null, "Pointer", true, true)
    );

    List<Row> rows = users.stream()
      .filter(user -> user.isEnabled())
      .map(user -> {
        Row row = new Row();

        String fullName = Optional.ofNullable(user.getFirstName())
          .map(firstName -> {
            return Optional.ofNullable(user.getLastName())
              .map(lastName -> firstName + " " + lastName)
              .get();
          })
          .orElse("<unknown>");

        row.addColumn(new Column(fullName));
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
