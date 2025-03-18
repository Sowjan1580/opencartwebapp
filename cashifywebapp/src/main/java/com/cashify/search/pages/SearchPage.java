package com.cashify.search.pages;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cashify.pages.BasePage;

public class SearchPage extends BasePage {
	private static final Logger log = LogManager.getLogger(SearchPage.class);

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='visible flex flex-col']")
	WebElement searchBox;

	@FindBy(xpath = "//div[@class='flex flex-col']//input[@placeholder='Search for mobiles, accessories & More']")
	WebElement searchInput;

	@FindBy(xpath = "//span[text()='Samsung Galaxy S23 Ultra 5G']")
	WebElement product;

	@FindBy(xpath = "//div[contains(text(),'256 GB')]")
	WebElement storageOption;

	@FindBy(xpath = "(//div[.='No Result Found'])[8]")
	WebElement noResultsFoundMessage;
	@FindBy(xpath = "//ul[contains(@class,'flex list-none p-0 m-0 w-full flex-col')]//li//span[@class=\"subtitle3 text-primary-text line-clamp-3\"]")
	List<WebElement> list;
	@FindBy(xpath="//div[@class=\"inherit body2 mb-2\"]")
	WebElement GetuptoLabel;

	public void enterProductName(String productName) throws InterruptedException {
		log.info("Start: enterProductName");
		Thread.sleep(5000);
		searchBox.click();
		log.info("Search box clicked.");
		Thread.sleep(5000);
		searchInput.sendKeys(productName);
		log.info("Product name entered: " + productName);
		Thread.sleep(2000);
		log.info("End: enterProductName");
	}

	

	public void chooseStorageOption() throws InterruptedException {
		log.info("Start: chooseStorageOption");
		Thread.sleep(4000);
		storageOption.click();
		log.info("Storage option selected: " + storageOption.getText());
		Thread.sleep(3000);
		log.info("End: chooseStorageOption");
	}

	public String getNoResultsMessage() {
		log.info("Start: getNoResultsMessage");
		String message = noResultsFoundMessage.getText();
		log.info("No results message retrieved: " + message);
		log.info("End: getNoResultsMessage");
		return message;
	}

	public boolean isProductVisible() {
		log.info("Start: isProductVisible");
		boolean isVisible = product.isDisplayed();
		log.info("Product visibility status: " + isVisible);
		log.info("End: isProductVisible");
		return isVisible;
	}

	public boolean searchResults(String brand) {
	    log.info("Start: searchResults method with brand: " + brand);
	    boolean a = true;

	    for (WebElement i : list) {
	        if ((i.getText().toLowerCase()).contains(brand.toLowerCase())) {
	            log.info("Matching result found: " + i.getText());
	            continue;
	        } else {
	            log.error("Non-matching result found: " + i.getText());
	            a = false;
	            break;
	        }
	    }

	    log.info("End: searchResults method with result: " + a);
	    return a;
	}
	public void selectProductFromList(String model) {
		log.info("Start: selectProductFromList");
		for (WebElement i : list) {
			if ((i.getText().toLowerCase()).contains(model)) {
				i.click();
				log.info("Product selected: " + product.getText());
				break;
			} 
		}
		log.info("End: selectProductFromList");
	}
	public String isProductDisplayedWithPrice() {
		return GetuptoLabel.getText();
	}
}
