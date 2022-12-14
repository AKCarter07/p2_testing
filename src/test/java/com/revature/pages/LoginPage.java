package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wdw;
    @FindBy(id = "username-input")
    private WebElement usnInput;

    @FindBy(id="password-input")
    private WebElement pwdInput;

    @FindBy(id="login-btn")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String usn) {usnInput.sendKeys(usn);}
    public void typePassword(String pwd) {pwdInput.sendKeys(pwd);}
    public void clickLogin(){loginBtn.click();}
}

