package GithubWeb;

import Base.BaseClass;
import Pages.GitHubPages;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void signUpMethod() throws InterruptedException {
        GitHubPages signup = new GitHubPages(driver);

        signup.openGitUrl();
        signup.clickOnSignUp();
        signup.clickOnTermsLink();
        signup.clickOnPrivacyLink();
    }
    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
        login.fillEmail();
        login.fillPassword();
        login.ClickOnLogin();
        Thread.sleep(3000);
    }

    @Test
    public void createRepoMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);

        loginPageMethod();
        home.clickOnNewRepo();
        home.fillRepoName();
        Thread.sleep(2000);
        home.scrollToPosition(0,600);
        home.clickOnCreateRepo();
        Thread.sleep(5000);
    }


}