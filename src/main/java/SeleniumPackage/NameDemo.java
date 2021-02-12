package SeleniumPackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NameDemo {

    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

         driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
         WebElement element = driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-9']"));
         element.click();

        Thread.sleep(2000);
        Select drpTrip = new Select(driver.findElement(By.xpath("//*[@role='listbox']")));
        Thread.sleep(2000);
        drpTrip.selectByValue("Afternoon");


    }
}






















//Find the radio button for “No” using its ID and click on it
        //   driver.findElement(By.id("no")).click();

//Click on Check Button
        // driver.findElement(By.id("buttoncheck")).click();

  //      List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));
    //    System.out.println("Number of elements:" + elements.size());  // print how many elements are there on page with the
        // id=name , we have 2

        /*for (int i = 0; i < elements.size(); i++) {
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value")); // yes and no

            // Now using Iterator we will iterate all elements
            Iterator<WebElement> iter = elements.iterator(); // yes and no

            // this will check whether list has some element or not
            while (iter.hasNext()) {

                // Iterate one by one
                WebElement item = iter.next();

                // get the text
                String label = item.getText();

                // print the text
                System.out.println("Row label is " + label);

                //  Finelements by locator -> 2 elements -> xpath should able to click
                //
*/
//            }

  //  }
//}