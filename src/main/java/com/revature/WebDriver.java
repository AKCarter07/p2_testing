package com.revature;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver.Options;

import javax.swing.*;
import java.time.Duration;

public class WebDriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("http://ec2-3-95-211-243.compute-1.amazonaws.com/home.html");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-btn\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        login.click();

        WebElement username = driver.findElement(By.xpath("//*[@id=\"username-input\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        WebElement sign_in = driver.findElement(By.xpath("//*[@id=\"login-btn\"]"));

        username.sendKeys("Elwy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        password.sendKeys("elf");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        sign_in.click();

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"logout-btn\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        logout.click();


//        WebElement loginbutton = driver.findElement((By.xpath("//*[@id=\"login-btn\"]")));

//        wait.until

//        loginbutton.click();


    }
//    public static void ca(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//
//        ChromeDriver driver = new ChromeDriver();
//
//        driver.get("http://127.0.0.1:5500/login.html");
//
//        WebElement create_account = driver.findElement(By.xpath("//*[@id=\"navbarBasicExample\"]/div[1]/a[2]"));
//        WebElement username = driver.findElement(By.xpath("//*[@id=\"username-input\"]"));
//        WebElement password = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
//        WebElement genre = driver.findElement(By.xpath("//*[@id=\"firstname-input\"]"));
//
//        create_account.click();
//        username.sendKeys("JohnDoe");
//        password.sendKeys("password");
//        genre.sendKeys("Fantasy");

}
