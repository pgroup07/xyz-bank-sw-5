package xyz.bank.testsuite;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import xyz.bank.pages.*;
import xyz.bank.testbase.BaseTest;

public class BankTest extends BaseTest {

    HomePage homePage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    AccountPage accountPage;
    CustomerLoginPage customerLoginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        homePage = new HomePage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();
        customerLoginPage = new CustomerLoginPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogin();
        Thread.sleep(1000);
        bankManagerLoginPage.clickOnAddCustomer();
        addCustomerPage.enterFirstName("Harry");
        addCustomerPage.enterLastName("Java");
        addCustomerPage.enterPostCode("326598");
        addCustomerPage.clickAddCustomer();
        switchToAlert();
        getTextFromAlert();
        acceptAlert();
    }

    @Test(groups = {"smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.selectCustomerName("Harry Java");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcess();
        switchToAlert();
        getTextFromAlert();
        acceptAlert();
    }

    @Test(groups = "regression")
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLogin();
        customersPage.selectYourName("Harry Java");
        customersPage.clickLogin();
        String expectedText = "Logout";
        String actualText = customersPage.verifyLogOut();
        Assert.assertEquals(actualText, expectedText);
        customersPage.clickLogOut();
        String expectedText1 = "Harry Java";
        String actualText1 = customersPage.verifyWelcomeText();
        Assert.assertEquals(actualText1, expectedText1);
    }


    @Test(groups = {"sanity", "regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(1000);
        customerLoginPage.clickOnDropDownList();
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        customersPage.clickOnDepositButton();
        Thread.sleep(1000);
        customersPage.enterDeposit();
        Thread.sleep(1000);
        customersPage.setEnterDepositButton();
        Assert.assertEquals(customersPage.getDepositSuccessfullyMessage(), "Deposit Successful");

    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(1000);
        customerLoginPage.clickOnDropDownList();
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        customersPage.clickOnDepositButton();
        Thread.sleep(1000);
        customersPage.enterDeposit();
        Thread.sleep(1000);
        customersPage.setEnterDepositButton();
        Thread.sleep(1000);
        customersPage.clickOnWithdrawButton();
        Thread.sleep(1000);
        customersPage.enterWithdraw();
        Thread.sleep(1000);
        customersPage.setWithdrawFinal();
        Assert.assertEquals(customersPage.withdrawMessageSuccessFully(), "Transaction successful");
    }
}