package com.axonivy.demo.axon.ivy.form.editor.demo.enums;

public enum FederalState {

  BADEN("Baden-Württemberg"), BAYERN("Bayern"), BERLIN("Berlin"), BRANDENBURG("Brandenburg"), HAMBURG("Hamburg"), HESSEN("Hessen"),
  MECKLENBURG("Mecklenburg-Vorpommern"), NIEDERSACHSEN("Niedersachsen"), NORDRHEIN("Nordrhein-Westfalen"), RHEINLAND("Rheinland-Pfalz"),
  ANHALT("SaarlandSachsenSachsen-Anhalt"), SCHLESWIG("Schleswig-Holstein"), THURINGEN("Thüringen");

  private String officialName;

  private FederalState(String officialName) {
    this.officialName = officialName;
  }

  public String getOfficialName() {
    return officialName;
  }

}
