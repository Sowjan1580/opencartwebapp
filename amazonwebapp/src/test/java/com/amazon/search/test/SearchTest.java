package com.amazon.search.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.test.BaseTest;

public class SearchTest extends BaseTest {

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

	public void searchProduct2() throws InterruptedException {

		
		searchProduct("iphone 15 pro max");
	}

	@AfterClass
	public void closeApp() {
		closeapp();
	}
}
