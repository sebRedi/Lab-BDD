package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[text()='Add Element']")
    private WebElement addElementButton;

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement deleteButton;

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void clickAddElementButton() {
        addElementButton.click();
    }

    public boolean isDeleteButtonDisplayed() {
        try {
            return deleteButton.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public boolean isDeleteButtonPresent() {
        try {
            return deleteButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}