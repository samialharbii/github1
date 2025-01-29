package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LoginPaths.*;
import static ObjectsPath.GitHubPaths.*;

public class GitHubPages {


    WebDriver driver = null;

    public GitHubPages(WebDriver driver) {
        this.driver = driver;


    }

    public void openGitUrl() {
        driver.get("https://github.com/");
    }
    public void clickOnSignInBtn() {
        WebElement signInBtn=driver.findElement(signUp);
        signInBtn.click();
    }
}
