package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id="username-input")
    private WebElement usernameInput;

    @FindBy(id="search-usn-btn")
    private WebElement searchUserBtn;

    @FindBy(id="isbn-input")
    private WebElement isbnInput;

    @FindBy(id="search-btn")
    private WebElement searchIsbnBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    public void typeUsername(String usn) {usernameInput.sendKeys(usn);}

    public void typeIsbn(String isbn)  {isbnInput.sendKeys(isbn);}

    public void clickSearchUser() {searchUserBtn.click();}

    public void clickSearchIsbn() {searchIsbnBtn.click();}

}
