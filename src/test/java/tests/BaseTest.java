package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.time.Duration;


public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://w-corp-stg.watheq.co/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
    }
    @AfterClass
    public void quit(){
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
