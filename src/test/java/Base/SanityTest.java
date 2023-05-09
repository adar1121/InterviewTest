package Base;


import Screens.Amazon;
import Screens.AutomationTesting;
import Screens.FileBin;
import Screens.Google;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SanityTest {

    private WebDriver driver;
    @BeforeClass
    public void beforeRun(){
        driver = DriverSingleton.getDriverInstance();
        driver.manage().window().maximize();
    }

    @Test
    public void Amazon(){
        Amazon amazon = new Amazon(driver);
        amazon.openWebsite();
        amazon.writeInSearch();
        amazon.clickOnSearch();
        amazon.clickOnAnythingFromSearch();
    }

    @Test
    public void Google(){
        Google google = new Google(driver);
        google.openWebSite();
        google.searchInGoogle();
        google.clickOnSearch();
        google.printResult();
        google.assertionResult();
    }

    @Test
    public void FileBin(){
        FileBin filebin = new FileBin(driver);
        filebin.openWebsite();
        filebin.uploadFile();
        filebin.printSize();
        filebin.assertionSize();
    }

    @Test
    public void AutomationTesting(){
        AutomationTesting automationTesting = new AutomationTesting(driver);
        automationTesting.openWebsite();
        automationTesting.enterEmail();
    }


}
