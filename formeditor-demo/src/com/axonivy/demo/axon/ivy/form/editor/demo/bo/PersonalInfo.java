package com.axonivy.demo.axon.ivy.form.editor.demo.bo;

import java.util.Date;

import com.axonivy.demo.axon.ivy.form.editor.demo.enums.Country;

public class PersonalInfo {
  private String firstName;
  private String lastName;
  private String email;
  private Integer age;
  private Date dateOfBirth;
  private Country country;
  private String aboutMe;
  private Boolean isTermsAccepted;

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public String getAboutMe() {
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  public Boolean getIsTermsAccepted() {
    return isTermsAccepted;
  }

  public void setIsTermsAccepted(Boolean isTermsAccepted) {
    this.isTermsAccepted = isTermsAccepted;
  }
}
