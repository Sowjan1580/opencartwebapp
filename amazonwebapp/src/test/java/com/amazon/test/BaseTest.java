package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.amazon.addtocart.pages.AddToCartpage;
import com.amazon.login.pages.LoginPage;
import com.amazon.removefromcart.pages.RemoveFromCartpage;
import com.amazon.search.pages.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	LoginPage loginpage;
	SearchPage s;
	public AddToCartpage atcpage;
	protected RemoveFromCartpage rfcpage;

	public void getWebDriver() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		Thread.sleep(5000);
		loginpage = new LoginPage(driver);
		s = new SearchPage(driver);
		atcpage = new AddToCartpage(driver);
		rfcpage = new RemoveFromCartpage(driver);
	}

	public void login() throws InterruptedException {
		loginpage.clickOnLogin();
		loginpage.enterMail();
		loginpage.clickContinue();
		loginpage.enterPassword();
		loginpage.clickOnSubmit();
		Thread.sleep(5000);

	}
	public void searchProduct(String product) throws InterruptedException {
		s.clearSearch();
		s.search(product);
		s.clickOnSearch();
		Thread.sleep(5000);
		

	}

	/*
	 * @Test(priority = 2) public void addtocart() throws InterruptedException {
	 * atcpage.search("samsung s24 ultra"); atcpage.clickOnSearch();
	 * atcpage.clickOnProduct(); Thread.sleep(5000); atcpage.clickOnATCButton();
	 * Thread.sleep(5000); atcpage.closeSlidesheet(); Thread.sleep(5000);
	 * atcpage.clearSearch(); atcpage.search("iphone 15 pro max");
	 * atcpage.clickOnSearch(); atcpage.clickOnProduct(); Thread.sleep(5000);
	 * atcpage.clickOnATCButton(); Thread.sleep(5000); atcpage.closeSlidesheet();
	 * Thread.sleep(5000);
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 3) public void removefromcart() throws InterruptedException
	 * { driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]")).click();
	 * Thread.sleep(5000);
	 * 
	 * for (int i = 1; i < 10; i++) { driver.findElement(By.
	 * xpath("//button[@aria-label='Increase quantity by one']")).click();
	 * Thread.sleep(1000); } Thread.sleep(3000); driver.findElement( By.
	 * xpath("//input[@aria-label=\"Delete Apple iPhone 15 Pro Max (256 GB) - Black Titanium\"]"
	 * )).click(); Thread.sleep(5000); driver.findElement(By.xpath(
	 * "//input[@aria-label=\"Delete Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 256GB Storage)\"]"
	 * )) .click(); Thread.sleep(5000); }
	 */

	public void closeapp() {
		driver.quit();
	}

}
