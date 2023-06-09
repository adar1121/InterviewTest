package Screens;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Google extends BasePage {

    WebDriver driver;
    public Google(WebDriver driver){
        this.driver = driver;
    }

    public void openWebSite(){
        driver.get(GOOGLE_WEBSITE);
    }

    public void searchInGoogle(){
        Google google = new Google(driver);
        google.openWebSite();
        driver.findElement(By.className("gLFyf")).sendKeys("5 USD to ILS");
    }

    public void clickOnSearch(){
        clickElement(By.id("btnK"));
    }

    public void printResult(){
        System.out.println(driver.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getText());
    }

    public void assertionResult(){
        final double VALUE = 18.18;
        Assert.assertEquals(Double.parseDouble(driver.findElement(By.xpath("//*[@id=\"knowledge-currency__updatable-data-column\"]/div[1]/div[2]/span[1]")).getText()),VALUE,0.1);
    }

}
