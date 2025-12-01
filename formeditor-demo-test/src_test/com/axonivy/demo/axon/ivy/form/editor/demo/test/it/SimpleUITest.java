package com.axonivy.demo.axon.ivy.form.editor.demo.test.it;

import org.junit.jupiter.api.Test;

import com.axonivy.demo.axon.ivy.form.editor.demo.enums.Country;
import com.axonivy.ivy.webtest.IvyWebTest;

@IvyWebTest
public class SimpleUITest extends WebBaseSetup {
  private static final String COUNTRY_DROPDOWN_CSS_SELECTOR = "#form\\:countries";

  @Test
  void simpleUIShowCountriesWhenClick() {
    login();
    startSimpleUIProcess();
    // Click to "Germany" option in Country drop-down
    verifyAndClickItemLabelInDropdown(COUNTRY_DROPDOWN_CSS_SELECTOR, Country.GERMANY.getName(), DROPDOWN_LIST_SUFFIX,
        DROPDOWN_LABEL_SUFFIX);
  }
}
