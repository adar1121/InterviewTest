package Base;

import Screens.*;
import Screens.AutomationTesting.Register;
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
        Register register = new Register(driver);
        register.openWebsite();
        register.enterEmailStartScreen();
        register.setFirstNameRegister();
        register.setLastNameRegister();
        register.setAddressRegister();
        register.setEmailAddressRegister();
        register.setPhoneRegister();
        register.setGenderRegister();
        register.setHobbiesRegister();
        register.setLanguagesRegister();
        register.setSkillsRegister();
        register.setCountryRegister();
        register.setDateOfBirthRegister();
        register.setPasswordRegister();
        register.uploadPhotoRegister();
        register.pressSumbitButtonRegister();
    }

    @Test
    public void CoinRate(){
        CoinRate coinRate = new CoinRate();
        coinRate.printILS_USDValue();
        coinRate.printILS_EURValue();
    }


}
