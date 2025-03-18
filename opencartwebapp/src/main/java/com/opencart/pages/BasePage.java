package com.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public Actions action;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		this.action=new Actions(driver);
	}
	public void explicitwait(WebElement element) {
		WebDriverWait ewait=new WebDriverWait(driver, Duration.ofSeconds(30));
		ewait.until(ExpectedConditions.visibilityOf(element));
	}
}
