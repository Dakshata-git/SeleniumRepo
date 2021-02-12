package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        // Start browser
        WebDriver driver = new ChromeDriver();

        //is always applied globally --is available for all the webelemnts
        //dynamic in nature
        // it can be overwritten with new value

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        WebElement createNewAccount = driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
        clickOn(driver,createNewAccount,20);

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        WebElement password = driver.findElement(By.id("password_step_input"));
        WebElement email = driver.findElement(By.name("reg_email__"));
        WebElement female = driver.findElement(By.xpath("//input[@type='radio']"));


        Thread.sleep(1000);
        mysendKeys(driver,firstName,20,"Test1");
        mysendKeys(driver,lastName,10,"Test1");
        mysendKeys(driver,email,10,"Test1");
        mysendKeys(driver,password,10,"Test1");
        clickOn(driver,female,10);

    }

    //Explicit wait
    //No explicit keyword or method
    //available with webdriver wait with some conditions
    // specific to element
    //dynamic in nature
    public static void mysendKeys(WebDriver driver, WebElement element,int timeout,String value)
    {
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver, WebElement element,int timeout)
    {
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}
