package xyz.bank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import xyz.bank.utilities.Utility;

public class CustomersPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourName;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logOutVerify;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement LogOutButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessFullMsg;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterDeposit;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdraw;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterWithdraw;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdraw1;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawFinal;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withdrawMessageSuccessFull;

    /**
     * This method use for select Name
     *
     * @param option
     */
    public void selectYourName(String option) {
        selectByVisibleTextFromDropDown(yourName, option);
    }

    /**
     * This method use for click on Login Button
     */
    public void clickLogin() {
        clickOnElement(loginButton);
    }

    /**
     * This method use for verify Logout text
     *
     * @return
     */
    public String verifyLogOut() {
        return getTextFromElement(logOutVerify);
    }

    /**
     * This method use for click on Logout Button
     */
    public void clickLogOut() {
        clickOnElement(LogOutButton);
    }

    /**
     * This method use for verify Name text
     *
     * @return
     */
    public String verifyWelcomeText() {
        return getTextFromElement(welcomeText);
    }


    public void clickOnDepositButton() {
        clickOnElement(deposit);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdraw);
    }

    public void setWithdrawFinal() {
        clickOnElement(withdrawFinal);
    }

    public String withdrawMessageSuccessFully() {
        return getTextFromElement(withdrawMessageSuccessFull);
    }

    public void enterDeposit() {
        sendTextToElement(enterDeposit, "100");
    }

    public void enterWithdraw() {
        sendTextToElement(enterWithdraw, "50");
    }

    public void setEnterDepositButton() {
        clickOnElement(depositButton);
    }

    public String getDepositSuccessfullyMessage() {
        return getTextFromElement(depositSuccessFullMsg);
    }
}
