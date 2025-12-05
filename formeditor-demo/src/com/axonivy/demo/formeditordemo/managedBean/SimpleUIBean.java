package com.axonivy.demo.formeditordemo.managedBean;

import java.util.Arrays;
import java.util.List;

import com.axonivy.demo.formeditordemo.enums.Country;

public class SimpleUIBean {
  private List<Country> countries = Arrays.asList(Country.values());

  public List<Country> getCountries() {
    return countries;
  }

  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }
}
