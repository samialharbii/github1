package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static ObjectsPath.GitHubPaths.*;

public class LoginPages {
    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;
    }

    public void openGitUrl() {
        driver.get("https://github.com/");
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
    public void clickOnparivce() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(parivce));
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn));
        signInBtn.click();
    }
}