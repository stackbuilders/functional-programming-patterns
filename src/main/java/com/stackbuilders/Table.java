package com.stackbuilders;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Table {
  private final List<Row> rows;

  public Table() {
    this.rows = new ArrayList<Row>();
  }

  public void addRow(Row row) {
    this.rows.add(row);
  }

  public void addRows(Collection<Row> rows) {
    this.rows.addAll(rows);
  }

  public void render() {
    for (Row row : rows) {
      row.render();
      System.out.println();
    }
  }
}
