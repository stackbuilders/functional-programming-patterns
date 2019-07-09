package com.stackbuilders;

public class App {


  public static void main(String[] args) {
    User[] users = new User[] {
      // admins
      new User("Bruce", "Banner", true),
      new User("Clinton", "Barton", true),
      new User("Natasha", "Romanoff", true),
      new User("Steve", "Rogers", true),
      new User("Thor", "Odisen", true),
      new User("Tony", "Stark", true),
      // members
      new User("Peter", "Parker", false),
      new User("Stephen", "Strange", false)
    };

    Table table = new Table();

    for (User user : users) {
      if (user.isEnabled()) {

      }
    }

    table.render();
  }
}
