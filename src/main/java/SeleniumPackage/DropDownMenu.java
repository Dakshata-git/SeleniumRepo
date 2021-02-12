package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://developer.mozilla.org/en/docs/Web/HTML/Element/select");

        // 1. getting drop down menu

        Thread.sleep(2000);

        WebElement categoriesDropDown = driver.findElement(By.name("pets"));
        Select categories = new Select(categoriesDropDown);

        // 3. selecting dropdown menu

        categories.selectByVisibleText("Dog");

         categories.selectByIndex(0);
         categories.selectByValue("cat");

    }
}