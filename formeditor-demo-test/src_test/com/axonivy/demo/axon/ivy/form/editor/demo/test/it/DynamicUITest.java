package com.axonivy.demo.axon.ivy.form.editor.demo.test.it;

import org.junit.jupiter.api.Test;

import com.axonivy.demo.axon.ivy.form.editor.demo.enums.Country;
import com.axonivy.ivy.webtest.IvyWebTest;

@IvyWebTest
public class DynamicUITest extends WebBaseSetup {

  private static final String COUNTRY_DROPDOWN_CSS_SELECTOR = "#form\\:country";
  private static final String FEDERAL_STATE_DROPDOWN_CSS_SELECTOR = "#form\\:federal-state";

  @Test
  void dynamicUIShowFederalStateWhenCountryOfGermanyIsChosen() {
    login();
    startDynamicUIProcess();
    // Click to "Germany" option in Country drop-down
    verifyAndClickItemLabelInDropdown(COUNTRY_DROPDOWN_CSS_SELECTOR, Country.GERMANY.getName(), DROPDOWN_LIST_SUFFIX, DROPDOWN_LABEL_SUFFIX);
    // Check if "Federal State" is rendered
    verifyElementVisible(FEDERAL_STATE_DROPDOWN_CSS_SELECTOR);
  }
}