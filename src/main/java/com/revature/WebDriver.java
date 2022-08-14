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


    }
    public static void ca(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500/login.html");

        WebElement create_account = driver.findElement(By.xpath("//*[@id=\"navbarBasicExample\"]/div[1]/a[2]"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"username-input\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        WebElement genre = driver.findElement(By.xpath("//*[@id=\"firstname-input\"]"));

        create_account.click();
        username.sendKeys("JohnDoe");
        password.sendKeys("password");
        genre.sendKeys("Fantasy");
    }
}
