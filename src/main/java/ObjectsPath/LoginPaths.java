package ObjectsPath;

import org.openqa.selenium.By;

public class LoginPaths {

    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");
    public static final By email = By.xpath("//input[@id='login_field']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By signInBtn = By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]");
}

