package com.cashify.sell.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cashify.pages.BasePage;

public class SellPage extends BasePage {
    private static final Logger log = LogManager.getLogger(SellPage.class);

    public SellPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//button[.='Sell Now'])[1]")
    WebElement sellNowButton;

    @FindBy(xpath = "//input[@id='address-pincode']")
    WebElement pincodeInput;

    @FindBy(xpath = "//h2[.='Location Unavailable for Pickup']")
    WebElement locationUnavailableMessage;

    @FindBy(xpath = "//h3[.='Price Change Alert']")
    WebElement priceChangeAlertMessage;

    public void clickOnSellNow() throws InterruptedException {
        log.info("Start: clickOnSellNow");
        Thread.sleep(5000); // Consider replacing with explicit or fluent wait
        sellNowButton.click();
        log.info("Clicked on 'Sell Now' button.");
        log.info("End: clickOnSellNow");
    }

    public void enterPincode(String pincode) throws InterruptedException {
        log.info("Start: enterPincode");
        log.info("Entering pincode: " + pincode);
        Thread.sleep(5000); // Consider replacing with explicit or fluent wait
        pincodeInput.clear();
        Thread.sleep(2000); // Consider replacing with explicit or fluent wait
        pincodeInput.sendKeys(pincode);
        log.info("Pincode entered successfully.");
        log.info("End: enterPincode");
    }

    public String getLocationUnavailableMessage() throws InterruptedException {
        log.info("Start: getLocationUnavailableMessage");
        Thread.sleep(3000); // Consider replacing with explicit or fluent wait
        String text = locationUnavailableMessage.getText();
        log.info("Location unavailable message fetched: " + text);
        log.info("End: getLocationUnavailableMessage");
        return text;
    }

    public String getPriceChangeAlertMessage() throws InterruptedException {
        log.info("Start: getPriceChangeAlertMessage");
        Thread.sleep(3000); // Consider replacing with explicit or fluent wait
        String alertText = priceChangeAlertMessage.getText();
        log.info("Price change alert message fetched: " + alertText);
        log.info("End: getPriceChangeAlertMessage");
        return alertText;
    }
}
