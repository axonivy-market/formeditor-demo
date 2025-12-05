package com.axonivy.demo.axon.ivy.form.editor.demo.enums;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public enum Country {
  VIETNAM("Vietnam"), GERMANY("Germany"), THAILAND("Thailand"), CAMBODIA("Cambodia"), MALAYSIA("Malaysia"), MOZAMBIQUE(
      "Mozambique"), JAMAICA("Jamaica");

  private final String name;

  private Country(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static List<Country> getSortedByName() {
    return Arrays.stream(values())
        .sorted(Comparator.comparing(Country::getName))
        .toList();
}
}
