# Automation Task

**Note -** Please do not setup your own WebDriver implementation. This has already been done for you.

# Tasks to complete

Below are a number of tasks which related to the Finance Calculator which can be found on [https://www.landrover.co.uk/offers-and-finance/finance-calculator.html](https://www.landrover.co.uk/offers-and-finance/finance-calculator.html)

1. Test 1 | On loading the model selection page for Finance Calculator ensure that the number of nameplates displayed is correct (At the time of writing this is 11).
2. Test 2 | Open up the filter by Dropdown, change the monthly payment to £750, change the deposit to £20,000 and click Accept Values & Calculate.
3. Test 3 | Select a model from the model selection page and confirm the personalised quote page has loaded. Click on the change vehicle button and ensure you are returned to the model selection page and can select a different nameplate.
4. Test 4 | Select a model from the model selection page and confirm the personalised quote page has loaded. Change the dropdown value for the Engine Dropdown from the default engine selected.
5. Test 5 | On the personalised quote page, click on the tooltip icon next to the finance product options and ensure that the information modal has opened.
6. Test 6 | On the personalised quote page, change various options within for the finance quote (e.g Finance Product, Total Deposit or Duration of Agreement) and click on the calculate button. Ensure that you are presented with your quote details.

## Getting Started

**Opening this project**

This project is a Maven project, using Junit and using page object pattern for Selenium tests. There are a number of ways you can open this project, however the easiest way should be the following;

**Intellij Community Edition - [download](https://www.jetbrains.com/idea/download)**

*  Open Intellij
*  Click open project
*  Navigate to the POM.xml in the automation-task directory, select and click open
*  Click on Open as a project

## Additional notes

* We would like you to use Java and JUnit in order to complete the above tasks.
* Please use .zip in order to compress and return the completed test to us.

## HelloWorldTest

Contained within the project is a HelloWorldTest. This should give you some insight into how we would like your tests to be structured. It will be beneficial giving the test `helloWorldTest()` a run to ensure that everything is set-up and working within your local development environment.

* `automation-task/src/main/java/com/connect_group/pages/helloworld/SignUpPage.java` - PageObject for the Sign Up Page.
* `automation-task/src/main/java/com/connect_group/pages/helloworld/ReceiptPage.java` - PageObject for the Receipt Page.
* `automation-task/src/main/java/com/connect_group/tests/helloworld/HelloWorldTest.java` - Test class for the HelloWorldTest.

Additional information - https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests