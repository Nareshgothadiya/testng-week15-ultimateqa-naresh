package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@href='/users/sign_in']")
    WebElement signinLink;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome Back!')]")
    WebElement verifyText;


    public void clickOnSigninButton() {
        Reporter.log("clickOnSigninButton" + signinLink.toString());
        clickOnElement(signinLink);
    }

    public String getVerifyText() {
        Reporter.log("getVerifyText" + verifyText.toString());
        return getTextFromElement(verifyText);
    }
}
