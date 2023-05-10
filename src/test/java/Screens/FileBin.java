package Screens;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileBin extends BasePage {

    private WebDriver driver;
    public FileBin(WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(){
        driver.get("https://filebin.net/");
    }

    public void uploadFile(){
        sendKeysToElement(By.id("fileField"),"C:\\Users\\user\\Desktop\\22.txt");
    }

    public void printSize(){
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]")).getText());
    }

    public void assertionSize(){
        final String FILESIZE = "5 B";
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/table/tbody/tr/td[3]")).getText(),FILESIZE);
    }
}
