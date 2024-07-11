package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver){
        super(driver);
    }

    By companyName = By.xpath("//input[@type='text']");
    By emailAddress = By.xpath("//input[@type='email']");
    By phoneNumber = By.xpath("//input[@name='phone']");

    By password = By.xpath("//input[@name='password']");
    By confirmationPassword = By.xpath("//input[@name='confirm_password']");
    By checkBox = By.xpath("//input[@type='checkbox']");
    public void enterCompanyName(String companyNameText){
        driver.findElement(companyName).sendKeys(companyNameText);
    }

    public void enterEmailAddress(String emailAddressText){
        driver.findElement(emailAddress).sendKeys(emailAddressText);
    }

    public void enterPhoneNumber(String phoneNumberText){
        driver.findElement(phoneNumber).sendKeys(phoneNumberText);
    }

    public void enterPassword(String passwordText){
        driver.findElement(password).sendKeys(passwordText);
    }

    public void enterConfirmationPassword(String confirmationPasswordText){
        driver.findElement(confirmationPassword).sendKeys(confirmationPasswordText);
    }

    public void clickCHeckBox(){
        driver.findElement(checkBox).click();
    }

}
