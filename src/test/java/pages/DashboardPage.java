package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    //@FindBy is used to locate the Dashboard button on the page using its XPath.
    // This allows Selenium to interact with the Dashboard button in the web application.
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learningMaterialsButton;

    @FindBy(id = "tab-btn-web")
    WebElement webTabButton;

    //constructor to initialize the WebDriver instance for the DashboardPage class
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLearnButton() {
        learnButton.click();
    }
    public void clickLearningMaterialsButton() {
        //webDriverWait is used to wait for the learningMaterialsButton to be visible before clicking it
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(learningMaterialsButton));
        learningMaterialsButton.click();
    }
    public void clickWebTabButton() {
        webTabButton.click();
    }
}
