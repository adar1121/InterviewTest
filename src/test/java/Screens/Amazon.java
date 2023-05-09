package Screens;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon {

    private WebDriver driver;
    public Amazon(WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(){
        driver.get("https://www.Amazon.com");
    }

    public void writeInSearch(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
    }

    public void clickOnSearch(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void clickOnAnythingFromSearch(){
        driver.findElement(By.className("s-image")).click();
    }

}

