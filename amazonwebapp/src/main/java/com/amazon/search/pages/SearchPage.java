package com.amazon.search.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.page.BasePage;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	  public void search(String product) {
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(product);
	    }

	    public void clickOnSearch() {
	        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    }
	    public void clearSearch() {
	        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	    }
}
