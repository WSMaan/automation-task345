package com.connect_group.pages.comparisontool;

import com.connect_group.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonToolPage extends BasePage {

  @FindBy(css = ".vehicles-slider")
  private WebElement vehicleSlider;

  public ComparisonToolPage(WebDriver driver) {
    super(driver);
  }

  public boolean isInitialized() {
    return vehicleSlider.isDisplayed();
  }
}