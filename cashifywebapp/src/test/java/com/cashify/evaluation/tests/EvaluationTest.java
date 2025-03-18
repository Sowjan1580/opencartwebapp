package com.cashify.evaluation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cashify.tests.BaseTest;

import java.util.logging.Logger;

public class EvaluationTest extends BaseTest {

    private static final Logger log = Logger.getLogger(EvaluationTest.class.getName());

    @BeforeClass
    public void initApp() throws InterruptedException {
        getWebDriver();
        // login(testDataProp.getProperty("validnumber"));
        searchProduct();
    }

    @Test(priority = 1)
    public void verifyEvaluationWithoutChoosingYesorNo() throws InterruptedException {
        log.info("Starting test: verifyEvaluationWithoutChoosingYesorNo");
        try {
            evaluationPage.clickOnGetExactValue();
            evaluationPage.clickOnGotIt();
            evaluationPage.clickOnContinue();
            Assert.assertEquals(evaluationPage.getTellUsText(), "Tell us more about your device?");
            log.info("Test passed: verifyEvaluationWithoutChoosingYesorNo");
        } catch (Exception e) {
            //logger.severe("Error in test verifyEvaluationWithoutChoosingYesorNo: " + e.getMessage());
            takeScreenshot("evaluation", "errormsg");
            Assert.fail(e.getMessage());
        }
    }

    @Test(priority = 2)
    public void verifyEvaluation() {
        log.info("Starting test: verifyEvaluation");
        driver.navigate().back();
        try {
            evaluationPage.clickOnGetExactValue();
             evaluationPage.clickOnGotIt();
            evaluationPage.clickOnYes();
            evaluationPage.clickOnContinue();
            evaluationPage.clickOnContinue();
            evaluationPage.clickOnContinue();
            evaluationPage.clickOnContinue();
            evaluationPage.selectEmiOption();
            log.info("Test passed: verifyEvaluation");
        } catch (Exception e) {
            //logger.severe("Error in test verifyEvaluation: " + e.getMessage());
            takeScreenshot("evaluation", "show sellnow");
            Assert.fail(e.getMessage());
        }
    }

    @AfterClass
    public void closeApp() throws InterruptedException {
        quitApp();
    }
}
