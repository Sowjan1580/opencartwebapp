package com.amazon.login.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.test.BaseTest;

public class LoginTest extends BaseTest {
	@BeforeClass
	public void initApp() throws InterruptedException {
		getWebDriver();
	}

	@Test(priority = 1)
	public void verifyLogin() throws InterruptedException {
		login();
	}

	@AfterClass
	public void closeApp() {
		closeapp();
	}
}
