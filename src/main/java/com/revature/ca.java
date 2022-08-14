package com.revature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
// account creation selenium

public class ca {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);

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
