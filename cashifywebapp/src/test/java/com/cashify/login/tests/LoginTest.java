package com.cashify.login.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cashify.tests.BaseTest;

@Test
public class LoginTest extends BaseTest {
    private static final Logger log = LogManager.getLogger(LoginTest.class);

    @BeforeClass
    public void initApp() throws InterruptedException {
        
        getWebDriver();
      
    }

    @Test(priority = 4)
    public void verifyLoginWithValidNumber() throws InterruptedException {
        log.info("Starting test: verifyLoginWithValidNumber");
        try {
            driver.navigate().refresh();
            login(testDataProp.getProperty("validnumber"));
            Assert.assertTrue(loginPage.isUserNameDisplayed(), "User name is not displayed.");
        } catch (Exception e) {
            takeScreenshot("login", "valid_login");
            Assert.fail("Login unsuccessful, homepage is not displayed. " + e.getMessage());
        }
        log.info("Ending test: verifyLoginWithValidNumber");
    }

    @Test(priority = 3)
    public void verifyLoginWithInvalidNumber() throws InterruptedException {
        log.info("Starting test: verifyLoginWithInvalidNumber");
        try {
            driver.navigate().refresh();
            loginPage.clickOnLogin();
            loginPage.enterMobileNumber(testDataProp.getProperty("invalidnumber"));
            loginPage.clickOnContinue();
            Assert.assertEquals(loginPage.getInvalidMobileNumberErrorMessage(), "Invalid Mobile number");
        } catch (Exception e) {
            takeScreenshot("login", "invalid_number");
            Assert.fail("Invalid number message not displayed. " + e.getMessage());
        }
        log.info("Ending test: verifyLoginWithInvalidNumber");
    }

    @Test(priority = 1)
    public void verifyLoginTerms() throws InterruptedException {
        log.info("Starting test: verifyLoginTerms");
        try {
            driver.navigate().refresh();
            loginPage.clickOnLogin();
            loginPage.enterMobileNumber(testDataProp.getProperty("validnumber"));
            loginPage.clickOnTermsAndConditionsCheckbox();
            Thread.sleep(3000);
            Assert.assertFalse(loginPage.isContinueButtonClickable(), "Continue button should not be clickable.");
        } catch (Exception e) {
            takeScreenshot("login", "unchecked_terms");
            Assert.fail("Continue button is enabled for unchecked terms. " + e.getMessage());
        }
        log.info("Ending test: verifyLoginTerms");
    }

    @Test(priority = 2)
    public void verifyLoginWithInvalidOTP() throws InterruptedException {
        log.info("Starting test: verifyLoginWithInvalidOTP");
        try {
            driver.navigate().refresh();
            login(testDataProp.getProperty("validnumber"));
            loginPage.enterOtp(testDataProp.getProperty("invalidOTP"));
         
            Assert.assertEquals(loginPage.getInvalidOtpErrorMessage(), "OTP is invalid");
        } catch (Exception e) {
            takeScreenshot("login", "invalid_OTP");
            Assert.fail("Invalid OTP message not displayed. " + e.getMessage());
        }
        log.info("Ending test: verifyLoginWithInvalidOTP");
    }

    @AfterClass
    public void closeApp() throws InterruptedException {
        quitApp();
    }
}
