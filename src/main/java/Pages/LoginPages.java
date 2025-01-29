package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static ObjectsPath.GitHubPaths.*;
import static ObjectsPath.GitHubPaths.signIn;
import static ObjectsPath.LoginPaths.*;

public class LoginPages {
    WebDriver driver = null;

    public LoginPages(WebDriver driver) {
        this.driver = driver;


    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }
    public void clickOnSignInBtn(){

        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();

    }




    public void clickOnSignUpBtn() {
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();
    }
    public void clickOnTermsBtn(){
        WebElement TermsBtn = driver.findElement(termsOfService);
        TermsBtn.click();
    }

    public void githubPrivacy(){
        WebElement PrivacyBtn = driver.findElement(githubPrivacy);
        PrivacyBtn.click();
    }

    public void githubStat(){
        WebElement StatBtn = driver.findElement(githubStat);
        StatBtn.click();
    }



}