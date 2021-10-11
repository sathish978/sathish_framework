package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class basePage
{
   protected WebDriver driver;

    //every class has own constructor

   public basePage(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,this);

   }

   //Re-useable function included here,example mouse actions,dropdown methods etc

    public static String getValue(String key)
    {
        String path = System.getProperty("user.dir")+File.separator+"config.properties";
        String value = null;
        try
        {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
            //   System.out.println(value);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return value;
    }






}
