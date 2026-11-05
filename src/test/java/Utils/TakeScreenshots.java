package Utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenshots {

    // The screenshotPath variable is used to store the path where the screenshots will be saved.
    // It uses the System.getProperty("user.dir") method to get the current working directory of
    // the project and appends "/target/screenshots" to it.
    // This means that the screenshots will be saved in a folder named "screenshots" inside the "target" directory of the project.
    String screenshotPath = System.getProperty("user.dir") + "/target/screenshots";

    //the takeSnapShot method takes a WebDriver instance and a screenshot name as parameters.
    public void takeSnapShot(WebDriver driver, String screenshotName) {
        //TakeScreenshot is an interface provided by Selenium WebDriver that allows you to capture screenshots of the current page.
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(screenshotPath, screenshotName + ".png");
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
