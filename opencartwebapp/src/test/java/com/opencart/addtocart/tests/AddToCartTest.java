package com.opencart.addtocart.tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencart.tests.BaseTest;

public class AddToCartTest extends BaseTest {
    private static final Logger log = LogManager.getLogger(AddToCartTest.class);

    @BeforeClass
    public void initApp() throws InterruptedException {
        log.info("Initializing WebDriver and launching the application.");
        getWebDriver();
        log.info("Application launched successfully.");
        login();
        searchProduct();
    }

    @Test(priority = 1)
    public void verifyAddToCart() throws InterruptedException {
        try {
            log.info("Starting test: verifyAddToCart");
            addToCartPage.selectProduct();
            log.info("Product selected successfully.");
            addToCartPage.clickOnAddtoCart();
            log.info("Add to Cart action performed successfully.");
            //driver.findElement(By.xpath("//button[@class='btn-close']")).click();
            log.info("Test completed: verifyAddToCart");
        } catch (Exception e) {
			takeScreenshot("Cart", "add");

            log.error("Error during verifyAddToCart test execution: " + e.getMessage(), e);
            Assert.fail("error", e);
        }
    }

    @Test(priority = 2)
    public void verifyRemoveFromCart() {
        try {
            log.info("Starting test: verifyRemoveFromCart");
            addToCartPage.clickOnShoppingCart();
            log.info("Navigated to Shopping Cart successfully.");
            addToCartPage.clickOnRemove();
            log.info("Item removed from the cart successfully.");
            log.info("Test completed: verifyRemoveFromCart");
        } catch (Exception e) {
			takeScreenshot("Cart", "remove");
            log.error("Error during verifyRemoveFromCart test execution: " + e.getMessage(), e);
            Assert.fail("error", e);

        }
    }

    @AfterClass
    public void closeApp() {
        log.info("Closing the application.");
        // driver.quit();
        log.info("Application closed.");
    }
}
