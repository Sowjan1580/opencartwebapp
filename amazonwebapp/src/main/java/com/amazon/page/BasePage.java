package com.amazon.page;

import org.openqa.selenium.WebDriver;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	/*public void clickOnLogin() {
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	}
	public void enterMail() {
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("sowjankumarjeejula@gmail.com");
	}
	public void clickContinue() {
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	}
	public void enterPassword() {
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("Sowjan@amazon1");
	}
	public void clickOnSubmit() {
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
	}*/
	
}
