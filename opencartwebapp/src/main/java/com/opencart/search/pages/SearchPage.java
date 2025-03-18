package com.opencart.search.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencart.pages.BasePage;

public class SearchPage extends BasePage {
    private static final Logger log = LogManager.getLogger(SearchPage.class);

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@name='search']")
	WebElement inputSearch;

	public void enterProduct(String product) throws InterruptedException {
		log.info("Clearing the search input field.");
		inputSearch.clear();
		log.info("Entering product name: " + product);
		inputSearch.sendKeys(product);
		log.info("Pressing Enter key.");
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(10000);
		log.info("Product search completed.");
	}
}
