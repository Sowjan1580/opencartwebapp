package com.cashify.sell.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cashify.search.pages.SearchPage;
import com.cashify.sell.pages.SellPage;
import com.cashify.tests.BaseTest;

public class SellTest extends BaseTest {
	//SearchPage searchPage;
	SellPage sellPage;
	private static final Logger log = LogManager.getLogger(SellTest.class);

	@BeforeClass
	public void initApp() throws InterruptedException {
		getWebDriver();
		login(testDataProp.getProperty("validnumber"));
		searchProduct();
		evaluation();
		sellPage = new SellPage(driver);
	}

	@Test(priority = 1)
	public void verifySellWithInvalidPincode() throws InterruptedException {
		log.info("Starting test: verifySellWithInvalidPincode");
		try {
			// Simulate wait (use explicit waits in real scenarios)
			sellPage.clickOnSellNow();
			sellPage.enterPincode("504251");
			Assert.assertEquals(sellPage.getLocationUnavailableMessage(), "Location Unavailable for Pickup");
			log.info("Test passed: verifySellWithInvalidPincode");
		} catch (Exception e) {
			log.error("Error in test verifySellWithInvalidPincode: " + e.getMessage());
			takeScreenshot("sell", "invalidpincode");
			Assert.fail(e.getMessage());
		}
		log.info("Ending test: verifySellWithInvalidPincode");
	}

	@Test(priority = 2)
	public void verifySellWithValidPincode() {
		log.info("Starting test: verifySellWithValidPincode");
		try {

			sellPage.enterPincode("500012");

			Assert.assertEquals(sellPage.getPriceChangeAlertMessage(), "Location Unavailable for Pickup");

			log.info("Test passed: verifySellWithValidPincode");
		} catch (Exception e) {
			log.error("Error in test verifySellWithValidPincode: " + e.getMessage());
			takeScreenshot("sell", "validpincode");
			Assert.fail(e.getMessage());
		}
		log.info("Ending test: verifySellWithValidPincode");
	}

	@AfterClass
	public void closeApp() throws InterruptedException {
		quitApp();
	}
}
