package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryFormPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    WebElement clickDeviceType;

    @FindBy(xpath = "//*[@id=\"brand\"]/option[2]")
    WebElement chooseBrand;

    @FindBy(id = "storage-128GB")
    WebElement chooseStorage;

    @FindBy(xpath = "//*[@id=\"color\"]/option[4]")
    WebElement chooseColor;

    @FindBy(xpath = "//*[@id=\"quantity\"]")
    WebElement chooseQuantity;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "inventory-next-btn")
    WebElement clickNextButton;

    @FindBy(id = "shipping-option-express")
    WebElement chooseShippingMethod;

    @FindBy(id = "warranty-1yr")
    WebElement chooseWarranty;

    @FindBy(id = "discount-code")
    WebElement discountCodeField;
    @FindBy (id = "apply-discount-btn")
    WebElement applyDiscountButton;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmButton;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoice;

    @FindBy(xpath = "//*[starts-with(@id, 'view-invoice-INV-')]")
    WebElement viewInvoiceDetails;

    // Constructor to initialize the WebDriver
    public InventoryFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDeviceType() {
        clickDeviceType.click();
    }
    public void chooseBrand() {
        chooseBrand.click();
    }
    public void chooseStorage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(chooseStorage));
        chooseStorage.click();
    }
    public void chooseColor() {
        chooseColor.click();
    }
    public void chooseQuantity(Integer quantity) {
    //String.valueOf is used to convert the Integer quantity to a String, which is required by the sendKeys method
        chooseQuantity.sendKeys(String.valueOf(quantity));
    }

    public void enterAddress(String address) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(addressField));
        addressField.sendKeys(address);
    }
    public void clickNextButton() {
        clickNextButton.click();
    }
    public void chooseShippingMethod() {
        chooseShippingMethod.click();
    }
    public void chooseWarranty() {
        chooseWarranty.click();
    }
    public void enterDiscountCode(String discountCode) {
        discountCodeField.sendKeys(discountCode);

    }
    public void clickApplyDiscountButton() {
        applyDiscountButton.click();
    }
    public void clickConfirmButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(confirmButton));
        confirmButton.click();
    }
    public void clickViewInvoice() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(viewInvoice));
        viewInvoice.click();
    }
    public void clickViewInvoiceDetails() {
        //new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(viewInvoiceDetails));
        viewInvoiceDetails.click();
    }




}
