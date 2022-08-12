package com.revature;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver.Options;

import javax.swing.*;
import java.time.Duration;

public class WebDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/login.html");

        WebElement username = driver.findElement(By.xpath("//*[@id=\"username-input\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-btn\"]"));

        username.sendKeys("Elwy");
        password.sendKeys("elf");
        login.click();



//        WebDriverWait loginwait = new WebDriverWait(driver, Duration.ofSeconds(3));

//        WebElement login;
//        By byXpath = By.xpath("//*[@id=\"navbarBasicExample\"]/div[2]/div/div/a[1]");
//        loginwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarBasicExample\"]/div[2]/div/div/a[1]")));
//
//        login = driver.findElement(byXpath);
//
//        login.click();

    }
}
