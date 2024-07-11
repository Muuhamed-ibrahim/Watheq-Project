package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

import java.time.Duration;

public class RegisterTest extends BaseTest{
    pages.LoginPage LoginPage;
    pages.RegisterPage RegisterPage;
    Faker faker;


    @Test
    public void RegisterWithValidData(){
        LoginPage = new LoginPage(driver);
        RegisterPage = new RegisterPage(driver);
        faker = new Faker();
        LoginPage.clickRegisterBtn();
        RegisterPage.enterCompanyName(faker.name().fullName());
        RegisterPage.enterEmailAddress(faker.internet().emailAddress());
        RegisterPage.enterPhoneNumber("0512345678");
        RegisterPage.enterPassword("Mm1234@#");
        RegisterPage.enterConfirmationPassword("Mm1234@#");
        RegisterPage.clickCHeckBox();

    }


}
