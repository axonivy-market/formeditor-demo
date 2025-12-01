package com.axonivy.demo.axon.ivy.form.editor.demo.bo;


import java.util.Date;

import com.axonivy.demo.axon.ivy.form.editor.demo.enums.FederalState;

public class PersonalData {
  private String firstName;
  private String lastName;
  private String eMail;
  private Date dateOfBirth;
  private String country;
  private FederalState federalState;

  public FederalState getFederalState() {
    return federalState;
  }

  public void setFederalState(FederalState federalState) {
    this.federalState = federalState;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
}
