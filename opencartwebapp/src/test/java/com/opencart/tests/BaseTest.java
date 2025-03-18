package com.opencart.tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.opencart.addtocart.pages.AddToCartPage;
import com.opencart.login.pages.LoginPage;
import com.opencart.search.pages.SearchPage;

public class BaseTest {
	public WebDriver driver;
	protected static Properties expectedAssertionsProp = null;
	protected static Properties testDataProp = null;
	public LoginPage loginPage;
	public SearchPage searchPage;
	public AddToCartPage addToCartPage;
	
	@BeforeSuite
	public void initTestData() {
		if (testDataProp == null) {
			FileReader testDataReader = null;
			FileReader assertionsReader = null;

			try {
				testDataReader = new FileReader("src/main/resources/testdata.properties");
				assertionsReader = new FileReader("src/main/resources/expectedassertion.properties");

				testDataProp = new Properties();
				testDataProp.load(testDataReader);

				expectedAssertionsProp = new Properties();
				expectedAssertionsProp.load(assertionsReader);

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {

					testDataReader.close();
					assertionsReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void takeScreenshot(String folder, String filename) {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "//test-output//failures//" + folder + "/" + filename
				+ "_" + System.currentTimeMillis() + ".jpg");
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void getWebDriver() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
		loginPage=new LoginPage(driver);
		searchPage=new SearchPage(driver);
		addToCartPage=new AddToCartPage(driver);
		Thread.sleep(20000);
	}
	
	public void login() throws InterruptedException {
		driver.navigate().refresh();
		loginPage.clickOnMyAccount();
		loginPage.clickOnLoginLabel();
		loginPage.enterEmail(testDataProp.getProperty("ValidEmailID"));
		loginPage.enterPassword(testDataProp.getProperty("ValidPassword"));
		loginPage.clickOnLoginButton();
	}
	public void searchProduct() throws InterruptedException {
		searchPage.enterProduct(testDataProp.getProperty("ValidProduct"));
	}

}
