import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RunScreenShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\bahti\\OneDrive\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        //take screenshot and as a file format
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //now copy the screenshot to dsired location using copyFile//method
        FileUtils.copyFile(src, new File("C:\\Users\\bahti\\OneDrive\\Pictures\\Screenshots\\facebook.png"));
        driver.close();
    }

}
