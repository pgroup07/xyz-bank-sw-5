package xyz.bank.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import xyz.bank.propertyreader.PropertyReader;
import xyz.bank.utilities.Utility;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeBrowser();
    }
}
