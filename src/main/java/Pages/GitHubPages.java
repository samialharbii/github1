package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.GitHubPaths.*;

public class GitHubPages {
    WebDriver driver = null;

    public GitHubPages (WebDriver driver){
        this.driver = driver;

    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }
    public void clickOnSignUp(){
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();
    }

    public void clickOnTermsLink(){
        WebElement Terms = driver.findElement(termsLink);
        Terms.click();
    }

    public void clickOnPrivacyLink(){
        WebElement Privacy = driver.findElement(githubPrivacy);
        Privacy.click();
    }


}

