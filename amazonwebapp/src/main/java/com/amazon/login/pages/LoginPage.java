package com.amazon.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.page.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	public void clickOnLogin() {
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
	}

}
