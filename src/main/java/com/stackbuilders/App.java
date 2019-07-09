package com.stackbuilders;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    User[] users = new User[] {
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
    };

    List<User> enabledUsers = new ArrayList<User>();
    for (User user : users) {
      if (user.isEnabled()) {
        enabledUsers.add(user);
      }
    }

    List<Row> rows = new ArrayList<Row>();
    for (User user : enabledUsers) {
      Row row = new Row();
      row.addColumn(new Column(user.getFirstName() + " " + user.getLastName()));
      String role = user.isAdmin() ? "ADMIN" : "MEMBER";
      row.addColumn(new Column(role));
      rows.add(row);
    }

    Table table = new Table();
    table.addRows(rows);
    table.render();
  }
}
