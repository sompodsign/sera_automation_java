package tests;

import base.BaseTests;
import model.CommonMethods;
import model.Locators;
import model.Timout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class Calculator {
    BaseTests baseTests = new BaseTests();
    WebDriver driver = baseTests.setUp();
    Timout timeout = new Timout();
    CommonMethods commonMethods = new CommonMethods(driver);
    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public void setUp () {
        driver.manage().window().maximize();
        driver.get(homePage.homePageUrl());
    }

    //Calculator
    @Test (priority = 1)
    public void CalculatorTestSell () {
        timeout.timeout();
        WebElement sellElement = this.driver.findElement(Locators.sellField);
        sellElement.click();
        sellElement.clear();
        commonMethods.sendText(Locators.sellField, "451");
        WebElement buyElement = this.driver.findElement(Locators.buyField);
        assertEquals(buyElement.getText(), "");
    }

    @Test (priority = 2)
    public void CalculatorTestBuy () {
        timeout.timeout();
        WebElement buyElement = this.driver.findElement(Locators.buyField);
        buyElement.click();
        buyElement.clear();
        buyElement.sendKeys("451");
        WebElement sellElement = this.driver.findElement(Locators.buyField);
        assertEquals(sellElement.getText(), "");
    }


    @AfterClass
    public void tearDown() {
        timeout.timeout();
        driver.quit();
    }
}
