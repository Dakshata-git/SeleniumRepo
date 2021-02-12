package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeriesOfActions {

     public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        String baseUrl = "http://www.facebook.com/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement txtUsername = driver.findElement(By.id("email"));

        Actions builder = new Actions(driver);
        Action seriesOfActions = builder
                .moveToElement(txtUsername)
                .click()
                .keyDown(txtUsername, Keys.SHIFT)  // This will type Hello in the uppercase // key press
                .sendKeys(txtUsername, "hello")
                 // hello -> HELLO
                 .keyUp(txtUsername, Keys.SHIFT)  //key release
                .doubleClick(txtUsername)  // This will highlight the hello text
                .contextClick()  // right click
                .build();

        seriesOfActions.perform() ;

    }
}
