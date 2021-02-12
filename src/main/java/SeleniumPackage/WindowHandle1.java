package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.naukri.com/");

        // It will return the parent window name as a String
        String mainWindow = driver.getWindowHandle();

        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> allWindowHandles = driver.getWindowHandles(); // return 3 window handle

        for(String handle : allWindowHandles)  // deal with mutiple window handles
        {
            driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
            System.out.println(driver.switchTo().window(handle).getTitle());
            String title = driver.switchTo().window(handle).getTitle();
            if(title.equals("HSBC"))
            {
                driver.findElement(By.xpath("//img")).click();
            }

        }
    }
}
