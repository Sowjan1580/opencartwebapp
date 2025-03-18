package com.amazon.addtocart.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.amazon.test.BaseTest;

public class AddToCartTest extends BaseTest {

	@BeforeClass
	public void initApp() throws InterruptedException {
		getWebDriver();
		login();
	}

	@Test(priority = 1)
	public void searchProduct1() throws InterruptedException {
		searchProduct("samsung s24 ultra");
	}

	@Test(priority = 2)
	public void addtocart1() throws InterruptedException {
		atcpage.clickOnProduct();
		Thread.sleep(5000);
		atcpage.clickOnATCButton();
		Thread.sleep(5000);
		atcpage.closeSlidesheet();
		Thread.sleep(5000);

	}

	@Test(priority = 3)
	public void searchProduct2() throws InterruptedException {
		searchProduct("iphone 15 pro max");

		
	}

	@Test(priority = 4)
	public void addtocart2() throws InterruptedException {
		atcpage.clickOnProduct();
		Thread.sleep(5000);
		atcpage.clickOnATCButton();
		Thread.sleep(5000);
		atcpage.closeSlidesheet();
		Thread.sleep(5000);
	}

	@AfterClass
	public void closeApp() {
		closeapp();
	}

}
