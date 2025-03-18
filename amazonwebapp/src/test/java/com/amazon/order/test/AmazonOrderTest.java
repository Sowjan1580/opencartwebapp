package com.amazon.order.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonOrderTest {
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	int c=3000,s=0;

	@Test(priority = 1)
	public void initapp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in");
		Thread.sleep(5000);
	}

	
	  @Test(priority = 2) 
	  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"))
	  .click(); driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys(
	  "sowjankumarjeejula@gmail.com");
	  driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	  driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys(
	  "Sowjan@amazon1");
	  driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	  Thread.sleep(10000);
	  
	  }
	 
	@Test(priority = 2)
	public void purchase() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("kreo hydra 3.5mm gaming earphones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"(//span[text()='Kreo Hydra 3.5mm Dual Dynamic Driver in-Ear Wired Gaming Earphones with Microphone, Tangle-Free Gaming Earphones with Noise Isolating Technology and EZ Volume Control Slider, Wired Headset for Gaming'])[1]"))
				.click();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id=\"a-autoid-2-announce\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='quantity_9']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for=\"pp-36uE5C-170\"]")).click();
		driver.findElement(By.xpath("//input[@aria-labelledby=\"pp-hp3Z7d-172-announce\"]")).click();
		js.executeScript("window.scrollBy(0,500);");
	}

}
