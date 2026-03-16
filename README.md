# BDD Selenium Lab -- Java, Cucumber and PageFactory

## Project Title

BDD Automation Lab using **Java, Selenium, ChromeDriver, Cucumber, and
PageFactory** executed in **GitHub Codespaces**.\
The project demonstrates Behavior Driven Development (BDD) by automating
scenarios on the testing site *The Internet*.

------------------------------------------------------------------------

## Getting Started

This project shows how to build automated UI tests using:

-   Selenium WebDriver
-   Cucumber for BDD scenarios
-   Maven for dependency management
-   PageFactory pattern for Page Object implementation

Two automated scenarios are included:

1.  **Google Search**
2.  **Add/Remove Elements (PageFactory implementation)**

The tests run in **headless Chrome inside GitHub Codespaces**.

------------------------------------------------------------------------

## Prerequisites

You need the following tools installed or available:

-   Java 17
-   Maven
-   Google Chrome / ChromeDriver
-   Git
-   GitHub Codespaces (recommended)

Verify installation:

``` bash
java -version
mvn -version
```

------------------------------------------------------------------------

## Installing

Clone the repository:

``` bash
git clone https://github.com/sebRedi/Lab-BDD
cd bdd-java
```

Install dependencies and build the project:

``` bash
mvn clean install
```

------------------------------------------------------------------------

## Running tests

Execute all BDD scenarios using:

``` bash
mvn test
```

Maven will run the Cucumber runners and execute the Selenium automation.

------------------------------------------------------------------------

## Test Scenarios

### Google Search

Automates a simple search in Google and verifies that the expected term
appears in the results.

### Add / Remove Elements (PageFactory)

Automates the following steps on:

https://the-internet.herokuapp.com/add_remove_elements/

Scenario:

1.  Open the Add/Remove Elements page
2.  Click **Add Element**
3.  Verify a **Delete** button appears
4.  Click **Delete**
5.  Verify the button disappears

This scenario demonstrates the **PageFactory pattern** to manage web
elements and actions.

------------------------------------------------------------------------

## Reports

After running the tests, Cucumber generates reports inside:

    target/HtmlReports/

Open the HTML report:

    target/HtmlReports/add_remove_elements_report.html

This report shows the execution status of the scenarios.

------------------------------------------------------------------------

## Project Structure

    bdd-java
    │
    ├── pom.xml
    │
    └── src
        └── test
            └── java
                ├── features
                │   ├── google_search.feature
                │   └── add_remove_elements.feature
                │
                ├── pages
                │   └── AddRemoveElementsPage.java
                │
                ├── runners
                │   ├── TestRunner.java
                │   └── AddRemoveElementsRunner.java
                │
                └── steps
                    ├── SearchSteps.java
                    └── AddRemoveElementsSteps.java

------------------------------------------------------------------------

## Built With

-   Java 17
-   Selenium WebDriver
-   ChromeDriver
-   Cucumber
-   Maven
-   GitHub Codespaces

------------------------------------------------------------------------

## Versioning

This project uses **Git** for version control.

------------------------------------------------------------------------

## Authors

Sebastian Galvis Briceño\
Systems Engineering Student -- Escuela Colombiana de Ingeniería Julio
Garavito

------------------------------------------------------------------------

## Acknowledgments

-   Selenium documentation
-   Cucumber documentation
-   The Internet testing site (https://the-internet.herokuapp.com)
