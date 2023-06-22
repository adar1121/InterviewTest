package Screens.AutomationTesting;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Alerts extends BasePage {
    WebDriver driver;
    public Alerts (WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(){
        driver.get("https://demo.automationtesting.in/Register.html");
    }
    public void goingToAlertsPage(){
        clickElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
        clickElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a"));
    }

    public void displayAlertBoxOkOnly(){
        clickElement(By.id("OKTab"));
    }

    public void displayAlertOkAndCancel(){
        clickElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
        clickElement(By.id("CancelTab"));
    }

    public void displayAlertWithTextBox(){
        clickElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
        clickElement(By.id("Textbox"));
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public void sendKeysToAlertTextBox(){
        driver.switchTo().alert().sendKeys("Adar");
    }

    public String receiveMessageFromAlert(By by){
       String text = driver.findElement(by).getText();
        System.out.println(text);
       return text;
    }
    public void assertString(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }
}
