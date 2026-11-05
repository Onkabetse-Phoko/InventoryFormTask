package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "login-email")
    WebElement usernameField;

    @FindBy(id = "login-password")
    WebElement passwordField;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        //WebDriverWait is used to wait for the username field to be visible before sending keys to it
        //Duration.ofSeconds(15) is used to specify the maximum time to wait for the element to be visible
        //expectedConditions.visibilityOf(usernameField) is used to specify the condition to wait for, which is the visibility of the username field
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {

        passwordField.sendKeys(password);
    }

    public void clickLoginSubmitButton() {

        loginSubmitButton.click();
    }

}


