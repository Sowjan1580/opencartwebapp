package com.amazon.addtocart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.amazon.page.BasePage;

public class AddToCartpage extends BasePage {
	public AddToCartpage(WebDriver driver) {
		super(driver);

	}

	public void clickOnProduct() {
		driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]"))
				.click();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
	}

	public void clickOnATCButton() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id=\"add-to-cart-button\"])[2]")).click();
		Thread.sleep(5000);
	}

	public void closeSlidesheet() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id=\"attach-close_sideSheet-link\"]")).click();
		Thread.sleep(5000);
	}

}
