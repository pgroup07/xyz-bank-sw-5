package xyz.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement PostCode;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomer;

    /**
     * This method use for enter First Name
     *
     * @param option
     */
    public void enterFirstName(String option) {
        sendTextToElement(firstName, option);
    }

    /**
     * This method use for enter Last Name
     *
     * @param option
     */
    public void enterLastName(String option) {
        sendTextToElement(lastName, option);
    }

    /**
     * This method use for enter Post code
     *
     * @param option
     */
    public void enterPostCode(String option) {
        sendTextToElement(PostCode, option);
    }

    /**
     * This method use for click Add Customer
     */
    public void clickAddCustomer() {
        clickOnElement(addCustomer);
    }

}
