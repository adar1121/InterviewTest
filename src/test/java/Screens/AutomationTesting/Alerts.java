package Screens.AutomationTesting;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts extends BasePage {
    WebDriver driver;
    public Alerts (WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(){
        driver.get("");
    }
    public void goingToAlertsPage(){
        clickElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
    }
}
