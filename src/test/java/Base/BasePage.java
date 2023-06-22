package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private static WebDriver driver = DriverSingleton.getDriverInstance();
    public WebElement getWebElement(By by){
        WebElement element;
        element = driver.findElement(by);

        return element;
    }
    public void clickElement(By by){
        driver.findElement(by).click();
    }
    public void sendKeysToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public final String FILEBIN_WEBSITE = "https://filebin.net/";
    public final String AMAZON_WEBSITE = "https://www.Amazon.com";
    public final String GOOGLE_WEBSITE = "https://www.google.com";

    public final String AUTOMATION_WEBSITE = "https://demo.automationtesting.in/Index.html";
}
