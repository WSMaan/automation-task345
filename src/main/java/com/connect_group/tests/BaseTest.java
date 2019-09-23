package com.connect_group.tests;

import com.connect_group.project_config.ScreenShotService;
import java.util.logging.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

  protected Logger LOGGER = Logger.getLogger(BaseTest.class.getName());

  @RegisterExtension
  protected ScreenShotService screenShotService = new ScreenShotService(this::getDriver);

  protected WebDriver driver;

  private WebDriver getDriver() {
    return driver;
  }

  protected void open(String url) {
    getDriver().get(url);
    LOGGER.info("Opening URL - " + url);
  }

  @BeforeAll
  public static void beforeSuite() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeEach
  public void startBrowser() {
    driver = new ChromeDriver(getChromeOptions());
    driver.manage().window().maximize();
  }

  private ChromeOptions getChromeOptions() {
    return new ChromeOptions().setHeadless(false);
  }

  @AfterEach
  public void afterSuite() {
    if (driver != null) {
      driver.quit();
    }
  }
}