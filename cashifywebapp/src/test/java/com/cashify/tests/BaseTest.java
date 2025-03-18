package com.cashify.tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.cashify.evaluation.pages.EvaluationPage;
import com.cashify.login.pages.LoginPage;
import com.cashify.search.pages.SearchPage;

public class BaseTest {
	public WebDriver driver;
	public LoginPage loginPage;
	protected static Properties expectedAssertionsProp = null;
	protected static Properties testDataProp = null;
	private static final Logger log = LogManager.getLogger(BaseTest.class);
	public SearchPage searchPage;
	protected EvaluationPage evaluationPage;

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

	//@Parameters({ "url" })
	public void getWebDriver() throws InterruptedException {

		driver = new ChromeDriver();
		log.info("Initializing the application and starting WebDriver.");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.cashify.in/");
		loginPage = new LoginPage(driver);
		searchPage = new SearchPage(driver);
		evaluationPage = new EvaluationPage(driver);
		log.info("WebDriver initialized successfully.");
		Thread.sleep(10000);

	}

	public void login(String number) throws InterruptedException {

		loginPage.clickOnLogin();
		loginPage.enterMobileNumber(number);
		loginPage.clickOnContinue();
		Thread.sleep(20000);

	}

	public void searchProduct() throws InterruptedException {
		searchPage.enterProductName(testDataProp.getProperty("validproduct"));
		searchPage.selectProductFromList("s23 ultra");
		searchPage.chooseStorageOption();

	}

	public void evaluation() throws InterruptedException {
		evaluationPage.clickOnGetExactValue();
		//evaluationPage.clickOnGotIt();
		evaluationPage.clickOnYes();
		evaluationPage.clickOnContinue();
		evaluationPage.clickOnContinue();
		evaluationPage.clickOnContinue();
		evaluationPage.clickOnContinue();
		evaluationPage.selectEmiOption();
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

	public void quitApp() throws InterruptedException {
		Thread.sleep(3000);
		log.info("Closing the application and quitting WebDriver.");

		driver.quit();
		log.info("Application closed and WebDriver quit successfully.");

	}
}