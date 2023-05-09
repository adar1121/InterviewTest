package Screens;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationTesting extends BasePage {

    private WebDriver driver;
    public AutomationTesting(WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(){
        driver.get("https://demo.automationtesting.in/Index.html");
    }

    public void enterEmail(){
        sendKeysToElement(By.id("email"),"moti123@gmail.com");
        clickElement(By.id("enterimg"));
    }



}
