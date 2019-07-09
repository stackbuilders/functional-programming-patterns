package com.stackbuilders;

import java.util.ArrayList;
import java.util.List;

public class Row {
  private final List<Column> columns;

  public Row() {
    this.columns = new ArrayList<Column>();
  }

  public void addColumn(Column row) {
    this.columns.add(row);
  }

  public void render() {
    for (Column column : columns) {
      column.render();
    }
  }
}
