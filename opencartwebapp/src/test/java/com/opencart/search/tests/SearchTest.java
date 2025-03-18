package com.opencart.search.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencart.tests.BaseTest;

public class SearchTest extends BaseTest {
	private static final Logger log = LogManager.getLogger(SearchTest.class);

	@BeforeClass
	public void initApp() throws InterruptedException {
		log.info("Initializing WebDriver and launching the application.");
		getWebDriver();
		log.info("Application launched successfully.");
		login();
	}

	@Test(priority = 1)
	public void verifySearchWithInvalidProduct() throws InterruptedException {
		log.info("Starting test: verifySearchWithInvalidProduct");
		try {
			searchPage.enterProduct(testDataProp.getProperty("InvalidProduct"));
			log.info("Test completed successfully: verifySearchWithInvalidProduct");
		} catch (Exception e) {
			takeScreenshot("search", "invalidPro");
			log.error("Error occurred in test: verifySearchWithInvalidProduct", e);
            Assert.fail("error", e);

		}
	}
	@Test(priority = 2)
	public void verifySearchWithSpace() throws InterruptedException {
		log.info("Starting test: verifySearchWithSpace");
		try {
			searchPage.enterProduct(" ");
			log.info("Test completed successfully: verifySearchWithSpace");
		} catch (Exception e) {
			takeScreenshot("search", "space");
			log.error("Error occurred in test: verifySearchWithSpace", e);
            Assert.fail("error", e);

		}
	}

	@Test(priority = 3)
	public void verifySearchWithValidProduct() throws InterruptedException {
		log.info("Starting test: verifySearchWithValidProduct");
		try {
			searchPage.enterProduct(testDataProp.getProperty("ValidProduct"));
			log.info("Test completed successfully: verifySearchWithValidProduct");
		} catch (Exception e) {
			takeScreenshot("search", "validPro");

			log.error("Error occurred in test: verifySearchWithValidProduct", e);
            Assert.fail("error", e);

		}
	}

	@AfterClass
	public void closeApp() {
		log.info("Closing the application.");

		// driver.quit();
		log.info("Application closed successfully.");

	}
}
