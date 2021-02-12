package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Launching the site.
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        // getting the current window handle id // parent window handle

        String mainWindowHandle = driver.getWindowHandle();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        System.out.println(mainWindowHandle);

        // getting all the window handles in Set data structure
        Set<String> allWindowHandles=driver.getWindowHandles(); // This will return all child windows open

        // traversing each ids with the help of iterator()
        Iterator<String> iterator =allWindowHandles.iterator(); // iterate through all window handles

        //Iterating through the window handle ids
        while(iterator.hasNext()) // how many windows is are there - 1
        {
            String ChildWindow=iterator.next(); // consider 1st child window

            if(!mainWindowHandle.equalsIgnoreCase(ChildWindow)) // please chk you are not in parent window
            {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                driver.findElement(By.name("emailid")).sendKeys("aaa@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(mainWindowHandle);
    }
 }

