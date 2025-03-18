package com.cashify.search.tests;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cashify.search.pages.SearchPage;
import com.cashify.tests.BaseTest;

public class SearchTest extends BaseTest {
	SearchPage searchPage;
	private static final Logger log = LogManager.getLogger(SearchTest.class);

	@BeforeClass
	public void setUp() throws InterruptedException {
		getWebDriver();
		// login(testDataProp.getProperty("validnumber"));
		searchPage = new SearchPage(driver);

	}

	@Test(priority = 1)
	public void verifySearchWithSymbol() throws InterruptedException {
		log.info("Starting method: verifySearchWithSymbol");
		driver.navigate().refresh();
		try {
			searchPage.enterProductName("!");
			Assert.assertEquals(searchPage.getNoResultsMessage(), "No Result Found",
					"No Result Found message is not displayed.");
		} catch (Exception e) {
			takeScreenshot("search", "symbol");
			log.error("Error during search with symbol: " + e.getMessage());
			Assert.fail("No Result Found is not displayed. " + e.getMessage());
		}

		log.info("Ending method: verifySearchWithSymbol");
	}

	@Test(priority = 2)
	public void verifySearchForInvalidProduct() throws InterruptedException {
		log.info("Starting method: verifySearchWithInvalidProduct");
		driver.navigate().refresh();

		try {
			searchPage.enterProductName(testDataProp.getProperty("invalidproduct"));
			Assert.assertEquals(searchPage.getNoResultsMessage(), "No Result Found",
					"No Result Found message is not displayed.");
		} catch (Exception e) {
			takeScreenshot("search", "invalid_product");
			log.error("Error during invalid product search: " + e.getMessage());
			Assert.fail("No Result Found message is not displayed. " + e.getMessage());
		}

		log.info("Ending method: verifySearchForInvalidProduct");
	}

	@Test(priority = 3)
	public void verifySearchForNumber() throws InterruptedException {
		driver.navigate().refresh();
		log.info("Starting method: verifySearchWithNumber");

		try {
			searchPage.enterProductName(testDataProp.getProperty("invalidnumber"));
			Assert.assertEquals(searchPage.getNoResultsMessage(), "No Result Found",
					"No Result Found message is not displayed.");
		} catch (Exception e) {
			takeScreenshot("search", "search_number");
			log.error("Error during number search: " + e.getMessage());
			Assert.fail("No Result Found message is not displayed. " + e.getMessage());
		}

		log.info("Ending method: verifySearchForNumber");
	}

	@Test(priority = 4)
	public void verifySearchResults() {
		driver.navigate().refresh();
		log.info("Starting method: verifySearchResults");
		try {
			searchPage.enterProductName(testDataProp.getProperty("validproduct"));
			Assert.assertTrue(searchPage.searchResults(testDataProp.getProperty("brand")),"Other brand product is displayed");
		} catch (Exception e) {
			takeScreenshot("search", "Results");
			log.error("Error during valid product results: " + e.getMessage());
			Assert.fail("Other brand product is displayed" + e.getMessage());
		}
		log.info("Ending method: verifySearchResults");
	}

	@Test(priority = 5)
	public void verifySelectingProductFromSearch() throws InterruptedException {
		log.info("Starting method: verifySearchWithValidProduct");
		driver.navigate().refresh();
		try {
			searchPage.enterProductName(testDataProp.getProperty("validproduct"));
			searchPage.searchResults(testDataProp.getProperty("brand"));
			searchPage.selectProductFromList("s23 ultra 5g");
			searchPage.chooseStorageOption();
			Assert.assertEquals(searchPage.isProductDisplayedWithPrice(), "Get Upto");
		} catch (Exception e) {
			takeScreenshot("search", "valid_product");
			log.error("Error during valid product search: " + e.getMessage());
			Assert.fail("Valid product is not displayed. " + e.getMessage());
		}

		log.info("Ending method: verifySearchForValidProduct");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		//quitApp();
	}
}
