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

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        System.setProperty("webdriver.chrome.driver", "/Users/bibuibanchi/Documents/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.id("inputUsername")).sendKeys("quannguyen@gmail.com");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement error = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@class='error']"))));
        String ActualText = error.getText();
        assertEquals("* Incorrect username or password", ActualText);
    }
}
