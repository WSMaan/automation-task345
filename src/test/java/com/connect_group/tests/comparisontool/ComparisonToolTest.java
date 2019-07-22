package com.connect_group.tests.comparisontool;

import com.connect_group.BaseTest;
import com.connect_group.pages.comparisontool.ComparisonToolPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComparisonToolTest extends BaseTest {

  @BeforeEach
  void navigateToURL() {
    open("https://www.landrover.co.uk/comparison-tool/index.html");
  }

  @Test
  void ensureComparisonToolLoads() {
    ComparisonToolPage comparisonToolPage = new ComparisonToolPage(driver);
    assertTrue(comparisonToolPage.isInitialized());
  }
}