package com.cashify.login.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cashify.pages.BasePage;

public class LoginPage extends BasePage {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    @FindBy(xpath = "//button[.=\"Login\"]")
    WebElement loginButton;

    @FindBy(id = "mobile-no")
    WebElement mobileNumberInput;

    @FindBy(xpath = "//button[.=\"CONTINUE\"]")
    WebElement continueButton;

    @FindBy(xpath = "//div[.='sowjan']")
    WebElement displayedUserName;

    @FindBy(xpath = "//span[.=\"Invalid Mobile number\"]")
    WebElement invalidNumberErrorMessage;

    @FindBy(xpath = "//input[@type=\"tel\"]")
    WebElement otpInput;

    @FindBy(xpath = "//span[.='OTP is invalid']")
    WebElement invalidOtpErrorMessage;

    @FindBy(xpath = "(//div[@class='flex justify-center items-center h-full aspect-square max-h-6 max-w-6 border-2 border-solid rounded-sm p-0.8 border-cta-border bg-cta-bg flex-col'])[1]")
    WebElement termsAndConditionsCheckbox;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLogin() throws InterruptedException {
        log.info("Start: clickOnLogin");
        loginButton.click();
        log.info("Login button clicked.");
        log.info("End: clickOnLogin");
    }

    public void enterMobileNumber(String number) {
        log.info("Start: enterMobileNumber with number: " + number);
        explicitWait(mobileNumberInput);
        mobileNumberInput.sendKeys(number);
        log.info("Mobile number entered.");
        log.info("End: enterMobileNumber");
    }

    public void clickOnContinue() {
        log.info("Start: clickOnContinue");
        fluentWait(continueButton);
        continueButton.click();
        log.info("Continue button clicked.");
        log.info("End: clickOnContinue");
    }

    public String getInvalidMobileNumberErrorMessage() {
        log.info("Start: getInvalidMobileNumberErrorMessage");
        String errorMessage = invalidNumberErrorMessage.getText();
        log.info("Invalid mobile number error message retrieved: " + errorMessage);
        log.info("End: getInvalidMobileNumberErrorMessage");
        return errorMessage;
    }

    public String getInvalidOtpErrorMessage() {
        log.info("Start: getInvalidOtpErrorMessage");
        explicitWait(invalidOtpErrorMessage);
        String errorMessage = invalidOtpErrorMessage.getText();
        log.info("Invalid OTP error message retrieved: " + errorMessage);
        log.info("End: getInvalidOtpErrorMessage");
        return errorMessage;
    }

    public boolean isContinueButtonClickable() {
        log.info("Start: isContinueButtonClickable");
        boolean isClickable = continueButton.isEnabled();
        log.info("Continue button clickable status: " + isClickable);
        log.info("End: isContinueButtonClickable");
        return isClickable;
    }

    public void clickOnTermsAndConditionsCheckbox() {
        log.info("Start: clickOnTermsAndConditionsCheckbox");
        termsAndConditionsCheckbox.click();
        log.info("Terms and Conditions checkbox clicked.");
        log.info("End: clickOnTermsAndConditionsCheckbox");
    }

    public void enterOtp(String otp) {
        log.info("Start: enterOtp with OTP: " + otp);
        fluentWait(otpInput);
        otpInput.sendKeys(otp);
        log.info("OTP entered.");
        log.info("End: enterOtp");
    }

    public boolean isUserNameDisplayed() {
        log.info("Start: isUserNameDisplayed");
        boolean isDisplayed = displayedUserName.isDisplayed();
        log.info("User name display status: " + isDisplayed);
        log.info("End: isUserNameDisplayed");
        return isDisplayed;
    }
}
