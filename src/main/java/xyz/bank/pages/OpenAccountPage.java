package xyz.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;


    /**
     * This method use for select Customer Name
     *
     * @param option
     */
    public void selectCustomerName(String option) {
        selectByVisibleTextFromDropDown(customerName, option);
    }

    /**
     * This method use for select Currency
     *
     * @param option
     */
    public void selectCurrency(String option) {
        selectByVisibleTextFromDropDown(currency, option);
    }

    /**
     * This method use for Process
     */
    public void clickOnProcess() {
        clickOnElement(processButton);
    }
}
