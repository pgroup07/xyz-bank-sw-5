package xyz.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickOnCustomer;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourName;

    /**
     * This method use for Click on Drop Down box
     */
    public void clickOnDropDownList() {
        selectByContainsTextFromDropDown(clickOnCustomer, "Harry Potter");
    }

    /**
     * This method use for Click on Login button
     */
    public void clickOnLoginButton() {
        clickOnElement(login);

    }

    /**
     * This method use for Click on Logout button
     */
    public void clickOnLogOutButton() {
        clickOnElement(logout);
    }

    /**
     * This method use for Verify Text message name
     * @return
     */
    public String verifyYourNameMessageIsDisplayed() {
        return getTextFromElement(yourName);
    }
}
