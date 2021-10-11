package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage extends basePage

{
     //constructors
    public loginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    // we use only Identification methods here(@FindBy)

     @FindBy(id="txtUsername")
    WebElement loginField;

    @FindBy(id="txtPassword")
    WebElement passwordField;

    @FindBy(id="btnLogin")
    WebElement loginButton;

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashboardTitle;

      //Business logic
      public void verifyLoginFlow(String username,String password)
      {
          loginField.clear();
          loginField.sendKeys(username);
          passwordField.clear();
          passwordField.sendKeys(password);
          loginButton.click();
          assertTitle(dashboardTitle,"Dashboard");

      }

      public static void assertTitle(WebElement element,String expected)
      {
          String actual = element.getText();
          System.out.println("Title is :"+actual);
          Assert.assertEquals(actual,expected,"Title mis-match");
      }


}
