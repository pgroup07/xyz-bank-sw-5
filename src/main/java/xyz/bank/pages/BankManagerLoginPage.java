package xyz.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;

public class BankManagerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement AddCustomerTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;

    /**
     * This method use for Click Add Customer
     */
    public void clickOnAddCustomer() {
        clickOnElement(AddCustomerTab);
    }

    /**
     * This method use for Click Open Account
     */

    public void clickOnOpenAccount() {
        clickOnElement(openAccount);
    }

}
