package xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;


public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement  BankManager ;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement  AddCustomerTab ;


    /**
     * This method use for Click on Manager Login
     */
    public void clickOnBankManagerLogin() {
        clickOnElement(BankManager);
    }

    /**
     * This method use for Click on Customer Login
     */
    public void clickOnCustomerLogin() {
        clickOnElement(AddCustomerTab);
    }

    By customerLogin = By.xpath("//button[text()='Customer Login']");
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickOnCustomerLoginButton() {
        clickOnElement(customerLogin);
    }

    public void clickOnBankManagerLoginButton() {
        clickOnElement(bankManagerLogin);
    }

}
