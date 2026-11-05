package Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startBrowser(String browserChoice, String url){

        //isHeadless variable is used to determine whether the browser should be launched in headless mode or not.
        boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", "false"));

        if (browserChoice.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (isHeadless) {
                options.addArguments("--headless=new");
            }
            driver = new ChromeDriver(options);
        }else if (browserChoice.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }
}
