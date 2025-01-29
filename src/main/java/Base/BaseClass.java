package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass //before running this class
    public void setUp() { //declaring driver location
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize tge page once opened
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://github.com/"); //go to this website
    }
/*

    @AfterClass
    public void tearDown() {
        driver.quit();

    }*/
    }