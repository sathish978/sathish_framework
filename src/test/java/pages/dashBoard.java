package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoard
{
    //constructors
    public dashBoard(WebDriver driver)
    {
        super();
        PageFactory.initElements(driver,this);
    }

    // we use only Identification methods here(@FindBy)

    @FindBy(xpath = "//span[contains(text(),'Leave List')]")
    WebElement LeaveListTitle;

    //Business logic
    public void dashBoardScreen()
    {
       LeaveListTitle.click();

    }

}
