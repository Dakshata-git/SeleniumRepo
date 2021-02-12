package SeleniumPackage;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");

        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");

        Actions ac = new Actions(driver);

        WebElement live= driver.findElement(By.xpath("//*[contains(@href,'/live')][@class='product-cards-wrapper--click--hoverclick']"));

        ac.moveToElement(live).build().perform();

        Thread.sleep(3000);

      //  driver.quit();

    }
}
