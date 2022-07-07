package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

class AppTest {
    /**
     * Rigorous Test.
     */
public static ExtentTest test;
public static ExtentReports report;
    @BeforeClass
        public static void startTest() {
            report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
            test = report.startTest("ExtentDemo");
        }
    @Test
    void testApp() {
        // System.setProperty("webdriver.chrome.driver", "/Users/bibuibanchi/Documents/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.id("inputUsername")).sendKeys("quannguyen@gmail.com");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(".error"))));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//p[@class='error']"))));
        WebElement error = driver.findElement(By.cssSelector(".error"));
        String ActualText = error.getText();
        assertEquals("* Incorrect username or password", ActualText);
        // if (error.getText().equals("* Incorrect username or password")) {
        //     test.log(LogStatus.PASS, "error message appear");
        // }
        // else {
        // test.log(LogStatus.FAIL, "Test Failed");
        // }
        driver.close();
        
    }
    @AfterClass
        public static void endTest() {
            report.endTest(test);
            report.flush();
        }
}
