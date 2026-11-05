package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import Utils.BrowserFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    public WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    //public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public TakeScreenshots takeScreenshots = new TakeScreenshots();

//    ReadData readData;
//
//    {
//        try {
//            readData = new ReadData();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }

}
