package xyz.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement depositButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement DepositedAmounts;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessFullMsg;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterDeposit;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;


    /**
     * This method use for click On Deposit Button
     */
    public void clickOnDeposit() {
        clickOnElement(depositButton);
    }

    /**
     * This method use for Deposited amount in account
     */
    public void amountToBeDeposited(String option) {
        sendTextToElement(DepositedAmounts, option);
    }

    /**
     * This method use for click on Deposit
     */
    public void clickOnDepositButton() {
        clickOnElement(deposit);
    }

    /**
     * This method use for Enter amount Deposit
     */
    public void enterDeposit() {
        sendTextToElement(enterDeposit, "100");
    }

    /**
     * This method use for click on Button
     */
    public void setEnterDepositButton() {
        clickOnElement(depositButton);
    }

    /**
     * This method use for verify text message
     *
     * @return
     */
    public String getDepositSuccessfullyMessage() {
        return getTextFromElement(depositSuccessFullMsg);
    }
}
