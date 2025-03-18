package com.opencart.login.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencart.tests.BaseTest;

public class LoginTest extends BaseTest {
	private static final Logger log = LogManager.getLogger(LoginTest.class);

	@BeforeClass
	public void initApp() throws InterruptedException {
		log.info("Initializing WebDriver and launching the application.");
		getWebDriver();
		log.info("Application launched successfully.");
	}

	@Test(priority = 1)
	public void verifyLoginWithInvalid() throws InterruptedException {
		log.info("Starting test: verifyLoginWithInvalid");
		driver.navigate().refresh();
		try {
			loginPage.clickOnMyAccount();
			loginPage.clickOnLoginLabel();
			loginPage.enterEmail(testDataProp.getProperty("InvalidEmailID"));
			loginPage.enterPassword(testDataProp.getProperty("InvalidPassword"));
			loginPage.clickOnLoginButton();
			Assert.assertEquals(loginPage.geterror(),expectedAssertionsProp.getProperty("error"));
		} catch (Exception e) {
			takeScreenshot("login", "invalid");
			Assert.fail(e.getMessage());
		}
		log.info("Ending test: verifyLoginWithInvalid");
	}

	@Test(priority = 2)
	public void verifyLoginWithInvalidEmail() throws InterruptedException {
		log.info("Starting test: verifyLoginWithInvalidEmail");
		driver.navigate().refresh();
		try {
			loginPage.enterEmail(testDataProp.getProperty("InvalidEmailID"));
			loginPage.enterPassword(testDataProp.getProperty("InvalidPassword"));
			loginPage.clickOnLoginButton();
			Assert.assertEquals(loginPage.geterror(),expectedAssertionsProp.getProperty("error"));

		} catch (Exception e) {
			takeScreenshot("login", "invalid");
			Assert.fail(e.getMessage());
		}
		log.info("Ending test: verifyLoginWithInvalidEmail");
	}

	@Test(priority = 3)
	public void verifyLoginWithInvalidPassword() throws InterruptedException {
		log.info("Starting test: verifyLoginWithInvalidPassword");
		driver.navigate().refresh();
		try {
			loginPage.enterEmail(testDataProp.getProperty("InvalidEmailID"));
			loginPage.enterPassword(testDataProp.getProperty("InvalidPassword"));
			loginPage.clickOnLoginButton();
			Assert.assertEquals(loginPage.geterror(),expectedAssertionsProp.getProperty("error"));
			log.info("Ending test: verifyLoginWithInvalidPassword");

		} catch (Exception e) {
			takeScreenshot("login", "invalid");
			Assert.fail(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void verifyLoginWithValid() throws InterruptedException {
		log.info("Starting test: verifyLoginWithValid");
		driver.navigate().refresh();
		try {
			loginPage.enterEmail(testDataProp.getProperty("ValidEmailID"));
			loginPage.enterPassword(testDataProp.getProperty("ValidPassword"));
			loginPage.clickOnLoginButton();
			log.info("Ending test: verifyLoginWithValid");

		} catch (Exception e) {
			takeScreenshot("login", "valid");
			Assert.fail(e.getMessage());
		}
	}

	@AfterClass
	public void closeApp() {
		log.info("Closing the application.");
		// driver.quit();
		log.info("Application closed.");
	}
}
