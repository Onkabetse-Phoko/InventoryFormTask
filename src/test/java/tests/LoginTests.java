package tests;

import Utils.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoginTests extends Base {
    @Test
    public void validLoginTest() {
        //takeSnapshots is a method in the TakeScreenshots class that
        // takes a screenshot of the current page and saves it to the specified location and will be named "BeforeLogin"
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername("mphoonka@gmail.com");
        loginPage.enterPassword("Phoko@!101");
        loginPage.clickLoginSubmitButton();
        //landingPage.verifyLoginSuccess();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");
//        landingPage.clickMenuButton();
//        landingPage.clickLogoutButton();
//        landingPage.acceptAlert();


    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
