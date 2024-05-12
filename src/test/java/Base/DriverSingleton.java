package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverSingleton {
    static WebDriver driver;
    static WebDriverWait webDriverWait;

    public static WebDriver getDriverInstance(){
        if(driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Automation\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWaitInstance(){
        if (webDriverWait == null){
            webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
        }
        return webDriverWait;
    }
}
