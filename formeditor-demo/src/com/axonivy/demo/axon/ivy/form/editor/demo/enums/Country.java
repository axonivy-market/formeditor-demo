package com.axonivy.demo.axon.ivy.form.editor.demo.enums;

public enum Country {
  VIETNAM("Vietnam"), GERMANY("Germany"), THAILAND("Thailand"), CAMBODIA("Cambodia"), MALAYSIA("Malaysia"), MOZAMBIQUE(
      "Mozambique"), JAMAICA("JAMAICA");

  private final String name;

  private Country(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
