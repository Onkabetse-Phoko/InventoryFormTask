package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.HomePage;
import pages.InventoryFormPage;
import pages.LoginPage;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    public WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
    public InventoryFormPage inventoryFormPage = PageFactory.initElements(driver, InventoryFormPage.class);
    public TakeScreenshots takeScreenshots = new TakeScreenshots();


}
