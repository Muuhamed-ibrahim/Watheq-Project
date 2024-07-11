package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected WebDriver driver;
public BasePage(WebDriver driver){
    this.driver = driver;
}
    public static void clicking(WebElement object){
        object.click();
    }

    public static void inputText(WebElement element, String text)
    {
        element.sendKeys(text);
    }
    public static void selecting(WebElement element, int x){
        Select select = new Select(element);
        select.selectByIndex(x);
    }
}
