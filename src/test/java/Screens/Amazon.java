package Screens;
import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazon extends BasePage {

    private WebDriver driver;
    public Amazon(WebDriver driver){
        this.driver = driver;
    }

    public void openWebsite(){
        driver.get(AMAZON_WEBSITE);
    }

    public void writeInSearch(){
        sendKeysToElement(By.id("twotabsearchtextbox"),"laptop");
    }

    public void clickOnSearch(){
        clickElement(By.id("nav-search-submit-button"));
    }

    public void clickOnAnythingFromSearch(){
        clickElement(By.className("s-image"));
    }
}