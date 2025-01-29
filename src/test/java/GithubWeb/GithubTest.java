package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void sigup() throws InterruptedException {
        LoginPages sigup = new LoginPages(driver);

        sigup.openGitUrl();
        sigup.clickOnSignInBtn();
        sigup.fillEmail();
        sigup.fillPassword();
        sigup.ClickOnLogin();
        Thread.sleep(3000); // يمكنك تقليل الوقت

    }
    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
        login.fillEmail();
        login.fillPassword();
       login.ClickOnLogin();
        Thread.sleep(3000); // يمكنك تقليل الوقت

    }
    public void createRepoMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        login.clickOnSignInBtn();
        login.fillEmail();
        login.fillPassword();
        login.ClickOnLogin();
        Thread.sleep(3000); // يمكنك تقليل الوقت

    }


}
