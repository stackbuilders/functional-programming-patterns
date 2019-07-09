package com.stackbuilders;

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

    Table table = new Table();

    for (User user : users) {
      if (user.isEnabled()) {
        Row row = new Row();
        row.addColumn(new Column(user.getFirstName() + " " + user.getLastName()));
        String role = "";
        if (user.isAdmin()) {
          role = "ADMIN";
        } else {
          role = "MEMBER";
        }
        row.addColumn(new Column(role));
        table.addRow(row);
      }
    }

    table.render();
  }
}
