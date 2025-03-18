package com.opencart.login.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencart.pages.BasePage;

public class LoginPage extends BasePage {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[.='Login']")
    WebElement loginLabel;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordInput;

    @FindBy(xpath = "//button[.='Login']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[.=' Warning: No match for E-Mail Address and/or Password. ']")
    WebElement errorMessage;
    public void clickOnMyAccount() {
        log.info("Clicking on 'My Account'.");
        myAccount.click();
        log.info("Clicked on 'My Account'.");
    }

    public void clickOnLoginLabel() throws InterruptedException {
        log.info("Clicking on 'Login' label.");
        loginLabel.click();
        //Thread.sleep(30000); // Simulate wait (replace with explicit wait in real scenarios)
        log.info("Clicked on 'Login' label.");
    }

    public void enterEmail(String email) {
        log.info("Entering email: " + email);
        explicitwait(emailInput);
        emailInput.sendKeys(email);
        log.info("Email entered.");
    }

    public void enterPassword(String password) {
        log.info("Entering password.");
        passwordInput.sendKeys(password);
        log.info("Password entered.");
    }

    public void clickOnLoginButton() throws InterruptedException {
        log.info("Clicking on 'Login' button.");
        loginBtn.click();
        Thread.sleep(5000);
        log.info("Clicked on 'Login' button.");
    }
    public String geterror() {
    	return errorMessage.getText();
    }
}

