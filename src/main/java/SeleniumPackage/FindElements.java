package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FindElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/ajax.html");

        List<WebElement> elements = driver.findElements(By.name("name")); // This will return 2 elements yes and no
        //Get the values



        //System.out.println("Number of elements:" + elements.size());

        for (int i = 0; i < elements.size(); i++) {  // this will contains 2 elements

           // System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));

                String text = elements.get(i).getAttribute("value");  // yes / No
                System.out.println(text);

                if (text.equalsIgnoreCase("yes")) {

                    System.out.println("Pass");
                    elements.get(i).click();

                } else {

                    System.out.println("Fail");
                }
            }
        }
    }



