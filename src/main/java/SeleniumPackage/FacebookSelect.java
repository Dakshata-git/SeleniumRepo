package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FacebookSelect {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
        Thread.sleep(1000);
        Select month = new Select(driver.findElement(By.id("month")));
        List<WebElement> monthcount = month.getOptions();
        System.out.println(monthcount.size());
        month.selectByVisibleText("Feb");
        Thread.sleep(1000);
        month.deselectByVisibleText("Feb");

    }
}
