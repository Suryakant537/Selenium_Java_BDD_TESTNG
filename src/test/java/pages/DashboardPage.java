package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class DashboardPage extends BrowserDriver {
    public static String shoetype ="//h3[@id='ShoeType']";
    public static void verify_shoe_details(){
        assertEquals(driver.findElements(By.xpath(shoetype)).get(0).getText(),"Formal Shoes");
        assertEquals(driver.findElements(By.xpath(shoetype)).get(1).getText(),"Sports");
        assertEquals(driver.findElements(By.xpath(shoetype)).get(2).getText(),"Sneakers");
    }
}
