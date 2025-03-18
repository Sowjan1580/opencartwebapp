package com.opencart.addtocart.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.opencart.pages.BasePage;

public class AddToCartPage extends BasePage {
    private static final Logger log = LogManager.getLogger(AddToCartPage.class);

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//img[@title='MacBook Pro'])[2]")
    private WebElement product;

    @FindBy(xpath = "//button[@id='button-cart']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    private WebElement shoppingCartBtn;

    @FindBy(xpath = "(//button[@class=\"btn btn-danger\"])[2]")
    private WebElement removeBtn;

   
    public void selectProduct() {
     
            log.info("Selecting product: MacBook Pro.");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,300);", product);
            log.info("Scrolling to product.");
            product.click();
            log.info("Product selected.");
       
    }

   
    public void clickOnAddtoCart() throws InterruptedException {
            log.info("Clicking on Add to Cart button.");
            addToCartBtn.click();
           // Thread.sleep(2000);
            log.info("Add to Cart action completed.");
      
    }

  
    public void clickOnShoppingCart() throws InterruptedException {
            log.info("Navigating to Shopping Cart.");
           // Thread.sleep(3000);
            explicitwait(shoppingCartBtn);

            shoppingCartBtn.click();
            log.info("Shopping Cart opened.");
     
    }

   
    public void clickOnRemove() throws InterruptedException {
            log.info("Clicking on Remove button in the Shopping Cart.");
            explicitwait(removeBtn);
            removeBtn.click();
            log.info("Item removed from the cart.");
        
    }
}
