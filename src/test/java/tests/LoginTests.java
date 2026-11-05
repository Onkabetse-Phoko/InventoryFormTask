package tests;

import Utils.Base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoginTests extends Base {
    @Test
    public void validLoginTest() throws InterruptedException {
        //takeSnapshots is a method in the TakeScreenshots class that
        // takes a screenshot of the current page and saves it to the specified location and will be named "BeforeLogin"
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername("mphoonka@gmail.com");
        loginPage.enterPassword("Phoko@!101");
        loginPage.clickLoginSubmitButton();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");
        dashboardPage.clickLearnButton();
        dashboardPage.clickLearningMaterialsButton();
        dashboardPage.clickWebTabButton();
        takeScreenshots.takeSnapShot(driver, "Inventory Form");
        inventoryFormPage.clickDeviceType();
        inventoryFormPage.chooseBrand();
        inventoryFormPage.chooseStorage();
        inventoryFormPage.chooseColor();
        inventoryFormPage.chooseQuantity(2);
        inventoryFormPage.enterAddress("123 Silverpine Avenue, Northcliff, Johannesburg");
        inventoryFormPage.clickNextButton();
        inventoryFormPage.chooseShippingMethod();
        inventoryFormPage.chooseWarranty();
        inventoryFormPage.enterDiscountCode("SAVE10");
        inventoryFormPage.clickApplyDiscountButton();
        inventoryFormPage.clickConfirmButton();
        inventoryFormPage.clickViewInvoice();
        inventoryFormPage.clickViewInvoiceDetails();

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(3000); // Wait for 3 seconds before quitting the driver
            driver.quit();

        }
    }
}
