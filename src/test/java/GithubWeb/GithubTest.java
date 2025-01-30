package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {


    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        Thread.sleep(3000); // يمكنك تقليل الوقت
        //login.clickOnSignInBtn();
        //login.clickOnterm();
        login.clickOnparivce();
    }


}
