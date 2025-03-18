package com.cashify.evaluation.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cashify.pages.BasePage;

public class EvaluationPage extends BasePage {
    private static final Logger log = LogManager.getLogger(EvaluationPage.class);

    public EvaluationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[.=\"Get Exact Value\"]")
    WebElement getExactValueButton;

    @FindBy(xpath = "//button[.=\"Got It\"]")
    WebElement gotItButton;

    @FindBy(xpath = "//button[.=\"Continue\"]")
    WebElement continueButton;

    @FindBy(xpath = "(//div[.=\"Below 3 monthsValid bill mandatory\"])[1]")
    WebElement emiOption;

    @FindBy(xpath = "//div[.='Tell us more about your device?']")
    WebElement tellUsText;

    public void clickOnGetExactValue() {
        log.info("Start: clickOnGetExactValue");
        fluentWait(getExactValueButton);
        getExactValueButton.click();
        log.info("Clicked on Get Exact Value button.");
        log.info("End: clickOnGetExactValue");
    }

    public void clickOnGotIt() throws InterruptedException {
        log.info("Start: clickOnGotIt");
        Thread.sleep(2000);
        gotItButton.click();
        log.info("Clicked on Got It button.");
        log.info("End: clickOnGotIt");
    }

    public void clickOnYes() throws InterruptedException {
        log.info("Start: clickOnYes");
        Thread.sleep(2000);
        for (int i = 1; i <= 5; i++) {
            driver.findElement(By.xpath("(//div[contains(@class,'border border-solid "
                    + "p-2 w-full sm:mr-5 sm:w-48 border-surface-bg bg-surface-light"
                    + " flex justify-start flex-row')])[" + i + "]")).click();
        }
        log.info("Clicked on Yes for all options.");
        log.info("End: clickOnYes");
    }

    public void clickOnContinue() throws InterruptedException {
        log.info("Start: clickOnContinue");
        continueButton.click();
        log.info("Clicked on Continue button.");
        Thread.sleep(2000);
        log.info("End: clickOnContinue");
    }

    public void selectEmiOption() {
        log.info("Start: selectEmiOption");
        emiOption.click();
        log.info("Selected EMI option.");
        log.info("End: selectEmiOption");
    }

    public String getTellUsText() {
        log.info("Start: getTellUsText");
        String text = tellUsText.getText();
        log.info("Retrieved text: " + text);
        log.info("End: getTellUsText");
        return text;
    }
}
