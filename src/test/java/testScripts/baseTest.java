package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.basePage;

import java.io.FileNotFoundException;

public class baseTest
{
    protected WebDriver driver;

    @BeforeClass
    public void setup() throws FileNotFoundException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(basePage.getValue("url"));

    }

    @AfterClass
    public void tearDown()
    {
     driver.quit();
    }



}
