package com.amazon.removefromcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.page.BasePage;

public class RemoveFromCartpage extends BasePage {
	public RemoveFromCartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickOnCartButton() throws InterruptedException {
		driver.findElement(By.xpath("//span[@id=\"nav-cart-count\"]")).click();
		Thread.sleep(5000);
	}

	public void increaseQuantity() throws InterruptedException {
		for (int i = 1; i < 6; i++) {
			driver.findElement(By.xpath("//button[@aria-label='Increase quantity by one']")).click();
			Thread.sleep(1000);
		}
	}
	public void deleteApple() throws InterruptedException {
		driver.findElement(
				By.xpath("//input[@aria-label=\"Delete Apple iPhone 15 Pro Max (256 GB) - Black Titanium\"]")).click();
		Thread.sleep(5000);
	}
	public void deleteSamsung() throws InterruptedException {
		driver.findElement(By.xpath(
				"//input[@aria-label=\"Delete Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 256GB Storage)\"]"))
				.click();
		Thread.sleep(5000);	}
	
}
