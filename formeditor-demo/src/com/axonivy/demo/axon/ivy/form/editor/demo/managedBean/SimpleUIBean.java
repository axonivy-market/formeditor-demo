package com.axonivy.demo.axon.ivy.form.editor.demo.managedBean;

import java.util.Arrays;
import java.util.List;

import com.axonivy.demo.axon.ivy.form.editor.demo.enums.Country;

public class SimpleUIBean {
  private List<Country> countries = Arrays.asList(Country.values());

  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }
}
