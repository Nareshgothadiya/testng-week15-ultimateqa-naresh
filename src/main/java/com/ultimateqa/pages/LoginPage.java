package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    //By signinLink = By.xpath("//a[@href='/users/sign_in']");
    @CacheLookup
    @FindBy(name = "user[email]")
    WebElement usernameField;

    @CacheLookup
    @FindBy(id = "user[password]")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email or password.')]")
    WebElement verifyMessage;


    public void enterUsername(String email) {
        Reporter.log("enterUsername" + usernameField.toString());
        sendTextToElement(usernameField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("enterPassword" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getVerifyText() {
        Reporter.log("getVerifyText" + verifyMessage.toString());
        return getTextFromElement(verifyMessage);
    }
}
