package testScripts;

import org.testng.annotations.Test;
import pages.dashBoard;
import pages.loginPage;

public class dashBoardTestCase extends baseTest
{

        @Test
        public void TestCase001()

        {
            loginPage lp = new loginPage(driver);

            lp.verifyLoginFlow("Admin","admin123");
            dashBoard db = new dashBoard(driver);
            db.dashBoardScreen();

        }
    }


