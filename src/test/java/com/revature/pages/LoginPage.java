package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement usn() {return driver.findElement(By.id("username-input"));}
    public WebElement pwd() {return driver.findElement(By.id("password-input"));}
    public WebElement loginBtn() {return driver.findElement(By.id("login-btn"));}

}

