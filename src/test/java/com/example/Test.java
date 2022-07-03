package com.example;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test implements WebDriver {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/banch/TestNG/demo/chromedriver.exe");
        driver.get("https://rahulshettyacademy.com");
        driver.close();
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public WebElement findElement(By by) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void get(String url) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getCurrentUrl() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPageSource() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getWindowHandle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> getWindowHandles() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Options manage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Navigation navigate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void quit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public TargetLocator switchTo() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
