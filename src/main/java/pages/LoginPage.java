package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    By RegisterBtn = By.xpath("//a[@href=\"/sign-up\"]");

public void clickRegisterBtn () {
    driver.findElement(RegisterBtn).click();
}
}
