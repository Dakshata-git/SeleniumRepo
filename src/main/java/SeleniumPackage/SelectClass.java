package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //Creating instance of Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the URL
        driver.get("https://demoqa.com/select-menu");

        //Maximizing window
        driver.manage().window().maximize();

        //Selecting the multi-select element by locating its id
        Select select = new Select(driver.findElement(By.id("cars")));

        Select select1 = new Select(driver.findElement(By.xpath("//input[@type='radio')]")));

        //Get the list of all the options
        System.out.println("The dropdown options are -");

        List<WebElement> options = select.getOptions();

        // This will print all the values /options available inside the multiselect option
        for (WebElement option : options)
            System.out.println(option.getText());

        // This is to scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");


            //Selecting option as 'Opel'-- ByIndex
            System.out.println("Select option Opel by Index");
            select.selectByIndex(2);
            Thread.sleep(2000);
            select.deselectByIndex(2);

/*            //Selecting the option as 'Saab'-- ByValue
            System.out.println("Select option saab by Value");
            select.selectByValue("saab");
            Thread.sleep(2000);
            select.deselectByValue("saab");*/

/*            // Selecting the option by text
            System.out.println("Select option Audi by Text");
            select.selectByVisibleText("Audi");
            Thread.sleep(2000);
            select.deselectByVisibleText("Audi");*/

           }
        }


