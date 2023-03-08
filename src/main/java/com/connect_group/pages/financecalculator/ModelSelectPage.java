package com.connect_group.pages.financecalculator;

import com.connect_group.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ModelSelectPage extends BasePage {
  WebElement myClass = getModelSelectNameplateContainer();

  List<WebElement> followingSiblings = myClass.findElements(By.xpath("./following-siblings::div"));

  public ModelSelectPage(WebDriver driver) {
    super(driver);
  }

  private WebElement getModelSelectNameplateContainer() {
    return driver.findElement(By.xpath("//div[@id=\"model-select-render\"]"));
  }

  public int getAllNameplates() {
    return followingSiblings.size();
  }

  public boolean isInitialized() {
    return getModelSelectNameplateContainer().isDisplayed();
  }

  // TODO: Add methods in to support interacting with the model selection page.
}