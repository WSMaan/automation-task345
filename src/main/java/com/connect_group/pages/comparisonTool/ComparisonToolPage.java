package com.connect_group.pages.comparisonTool;

import com.connect_group.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonToolPage extends BasePage {

  @FindBy(css = ".headerBox__heroTitle")
  private WebElement heroTitle;

  public ComparisonToolPage(WebDriver driver) {
    super(driver);
  }

  public boolean isInitialized() {
    return heroTitle.isDisplayed();
  }
}