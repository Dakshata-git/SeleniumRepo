package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
       // System.setProperty("webdriver.gekodriver.driver","C://firefoxdriver.exe");

        WebDriver driver = new ChromeDriver();

        //Thread.sleep(2000);  // to stop execution
        String baseUrl = "https://google.com"; // booking website name etc

        // I will open google and i will verify that it contains title as google  (yahoo)

        String expectedTitle = "Google1111";

        String actualTitle = "";

        // launch chrome and direct it to the Base URL

        driver.get(baseUrl);   // open ups the url

        // get the actual value of the title

        actualTitle = driver.getTitle();
        System.out.println("Actual title is : " +actualTitle);

        /*

         * compare the actual title of the page with the expected one and print

         * the result as “Passed” or “Failed”

         */

        if (actualTitle.contentEquals(expectedTitle)){

            System.out.println("Test Passed!");

        } else {

            System.out.println("Test Failed");

        }

        driver.close();

    }

}
