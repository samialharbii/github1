package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static ObjectsPath.GitHubPaths.*;
import static ObjectsPath.LoginPaths.*;

public class LoginPages {
    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;


    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }
    public void clickOnSignInBtn() {
        WebElement signInBtn=driver.findElement(signIn);
        signInBtn.click();
    }
    public void fillEmail(){
        WebElement Email = driver.findElement(email);
        Email.sendKeys("sami12474@hotmail.com");
    }

    public void fillPassword(){
        WebElement Email = driver.findElement(password);
        Email.sendKeys("123");
    }

    public void ClickOnLogin(){
        WebElement login = driver.findElement(signInBtn);
        login.click();
    }
/*
    public void clickOnSignInBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(signIn));
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
        signInBtn.click();
    }
     */
/*
    public void clickOnterm() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(term));
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
        signInBtn.click();
    }

 */
    /*
    public void clickOnparivce() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(parivce));
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
        signInBtn.click();
    }*/
}