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
        // driver.manage().window().maximize();
        driver.get(url);
        //dimension is used to set the size of the browser window to 1920 pixels wide and 1080 pixels tall.
        driver.manage().window().setSize(new Dimension(1920,1080));
        return driver;
    }
}
