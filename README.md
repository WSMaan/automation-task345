# Automation Task

**Note -** Please do not setup your own WebDriver implementation. This has already been done for you.

# Tasks to complete

Below are a number of tasks which related to the Comparison Tool which can be found on [landrover.co.uk](https://www.landrover.co.uk/comparison-tool/index.html#)

1. Ensure that 6 vehicles are displayed on the "01 Vehicles" step of the comparison tool.
2. Move to and click on the out of view "Discovery Sport" vehicle.
3. After clicking on a vehicle from the "01 Vehicles" step. Ensure user is navigated to the "02 Models" step, but can return back by clicking on the "01 Vehicles" step indicator.
4. Ensure that 2 options are displayed for the "Long Wheelbase" body style after clicking on the "Range Rover" vehicle on the "01 Vehicles" step.
5. Selecting vehicle options, move through each step ensuring vehicle is displayed within the comparison table.

## Getting Started

**Opening this project**

This project is a Maven project, using Junit and using page object pattern for Selenium tests. There are a number of ways you can open this project, however the easiest way should be the following;

**Intellij Community Edition - [download](https://www.jetbrains.com/idea/download)**

*  Open Intellij
*  Click open project
*  Navigate to the POM.xml in the automation-task directory, select and click open
*  Click on Open as a project

## HelloWorldTest

Contained within the project is a HelloWorldTest. This should give you some insight into how we would like your tests to be structured. It will be benficial giving the test `helloWorldTest()` a run to ensure that everything is set-up and working within your local development environment.

* `automation-task/src/main/java/com/connect_group/pages/helloworld/SignUpPage.java` - Page object for the Sign Up Page.
* `automation-task/src/main/java/com/connect_group/pages/helloworld/ReceiptPage.java` - Page object for the Receipt Page.
* `automation-task/src/main/java/com/connect_group/tests/helloworld/HelloWorldTest.java` - Test class for the HelloWorldTest.

Additional information - https://www.pluralsight.com/guides/getting-started-with-page-object-pattern-for-your-selenium-tests