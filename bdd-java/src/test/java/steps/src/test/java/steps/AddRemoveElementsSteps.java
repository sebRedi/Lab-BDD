package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.AddRemoveElementsPage;

import java.util.concurrent.TimeUnit;

public class AddRemoveElementsSteps {

    private WebDriver driver;
    private AddRemoveElementsPage addRemoveElementsPage;

    @Before
    public void setUp() {
        try {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            addRemoveElementsPage = new AddRemoveElementsPage(driver);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize ChromeDriver", e);
        }
    }

    @Given("I am on the Add Remove Elements page")
    public void iAmOnTheAddRemoveElementsPage() {
        addRemoveElementsPage.openPage();
    }

    @When("I click the Add Element button")
    public void iClickTheAddElementButton() {
        addRemoveElementsPage.clickAddElementButton();
    }

    @Then("I should see a Delete button")
    public void iShouldSeeADeleteButton() {
        assert addRemoveElementsPage.isDeleteButtonDisplayed();
    }

    @When("I click the Delete button")
    public void iClickTheDeleteButton() {
        addRemoveElementsPage.clickDeleteButton();
    }

    @Then("I should not see any Delete button")
    public void iShouldNotSeeAnyDeleteButton() {
        assert !addRemoveElementsPage.isDeleteButtonPresent();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}