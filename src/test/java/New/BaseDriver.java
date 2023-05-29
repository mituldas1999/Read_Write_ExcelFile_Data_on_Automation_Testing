package New;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseDriver {
    public static WebDriver driver;
    @BeforeSuite
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @AfterSuite
    public void close(){
        driver.close();
    }

}
