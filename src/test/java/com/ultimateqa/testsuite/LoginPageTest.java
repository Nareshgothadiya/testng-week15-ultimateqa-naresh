package com.ultimateqa.testsuite;

import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnSigninButton();
        Assert.assertEquals(homePage.getVerifyText(), "Welcome Back!", "Error Message not displayed");

    }

    @Test(groups = {"sanity", "smoke","regression"})
    public void verifyTheErrorMessage() {

        homePage.clickOnSigninButton();
        loginPage.enterUsername("Prime@gmail.com");
        loginPage.enterPassword("selenium123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getVerifyText(), "Invalid email or password.", "Error Message not displayed");

    }
}
