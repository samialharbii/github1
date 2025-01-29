package ObjectsPath;

import org.openqa.selenium.By;

public class GitHubPaths {
    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");
    public static final By singup=By.xpath("/html/body/div[1]/div[3]/header/div/div[1]/div[2]/a");
    public static final By term=By.xpath("//a[text()='Terms']");
    public static final By parivce=By.xpath("/html/body/div[1]/footer/div[2]/div/nav[1]/ul/li[3]/a[1]");
    public static final By username = By.xpath("//input[@id='login_field']");
    public static final By password = By.xpath("//input[@id='password']");
    public static final By signInBtn = By.xpath("//input[@name='commit']");
}
