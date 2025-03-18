package com.cashify.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cashify.login.pages.LoginPage;

public class BasePage {
	public WebDriver driver;
	FluentWait<WebDriver> fwait;
	WebDriverWait ewait;
	protected Actions action;
	
	

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		this.ewait=new WebDriverWait(driver, Duration.ofSeconds(30));
//		this.fwait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class)
//                .ignoring(StaleElementReferenceException.class);
		this.action=new Actions(driver);	
	}
	

	public void fluentWait(WebElement element) {
		fwait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);
		fwait.until(ExpectedConditions.visibilityOf(element));
	}
	public void explicitWait(WebElement element) {
		ewait=new WebDriverWait(driver, Duration.ofSeconds(30));
		ewait.until(ExpectedConditions.visibilityOf(element));
	}
}
