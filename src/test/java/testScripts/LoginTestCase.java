package testScripts;

import org.testng.annotations.Test;
import pages.loginPage;

public class LoginTestCase extends baseTest
{
    @Test
    public void TestCase001()

    {
        loginPage lp = new loginPage(driver);

        lp.verifyLoginFlow("Admin","admin123");



    }

}
