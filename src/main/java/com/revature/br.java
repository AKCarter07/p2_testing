package com.revature;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// book review
public class br {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://ec2-3-95-211-243.compute-1.amazonaws.com/login.html");

        WebElement username = driver.findElement(By.xpath("//*[@id=\"username-input\"]"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-btn\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        username.sendKeys("Bren");
        password.sendKeys("tabaxi");
        login.click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("//*[@id=\"my-lib\"]")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement library = driver.findElement(By.xpath("//*[@id=\"my-lib\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        library.click();
        WebElement book = driver.findElement(By.xpath("//*[@id=\"9780786966912\"]"));
        book.click();
        WebElement review = driver.findElement(By.xpath("//*[@id=\"add-review\"]"));
        review.click();
        WebElement rating = driver.findElement(By.xpath("//*[@id=\"rating-input\"]"));
        rating.sendKeys("10");
        WebElement review_text = driver.findElement(By.xpath("//*[@id=\"review-input\"]"));
        review_text.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque dapibus dui eget auctor viverra. Sed nulla urna, ullamcorper at enim rutrum, gravida imperdiet ex. Nullam enim felis,");
        WebElement submit = driver.findElement((By.xpath("//*[@id=\"review-input\"]")));
        submit.click();







    }


}
