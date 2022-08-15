package com.revature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.ws.WebEndpoint;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

// account creation selenium

public class ca {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
//        options.addArguments(("--incognito"));
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://ec2-3-95-211-243.compute-1.amazonaws.com/registration.html");

//        WebElement create_account = driver.findElement(By.xpath("//*[@id=\"create-account\"]"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"username-input\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        WebElement genre = driver.findElement(By.xpath("//*[@id=\"fav-genre-input\"]"));
//        WebDriverWait cawait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement sign_up = driver.findElement(By.xpath("//*[@id=\"register-submit-btn\"]"));


//        cawait.until(ExpectedConditions.elementToBeClickable(By.xpath("\"//*[@id=\\\"create-account\\\"]\"")));
//        create_account.click();

        username.sendKeys("JohnDoe");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        password.sendKeys("password");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        genre.sendKeys("Fantasy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        sign_up.click();
    }
}
