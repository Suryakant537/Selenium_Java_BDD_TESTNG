package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
    private static String usrname="usr";
    private static String pwd="pwd";
    private static String login_button="//input[@value='Login']";
    public static void enter_username(String username){
        driver.findElement(By.id(usrname)).sendKeys(username);
    }
    public static void enter_password(String password){
        driver.findElement(By.id(pwd)).sendKeys(password);
    }
    public static void click_login_button(){
        driver.findElement(By.xpath(login_button)).click();
    }
}
