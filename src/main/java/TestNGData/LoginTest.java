package TestNGData;

import Util.TestDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;
    private String excelSheetName = "Login";

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://ui.cogmento.com/");
    }

    // This Data provider is reading the excel and getting the data
    @DataProvider
    public Object[][] getData(){
        TestDataProvider testDataProvider = new TestDataProvider();
        Object testData[][] = testDataProvider.getDataFromSheet(excelSheetName);
        System.out.println(testData);
        return testData;
    }

    @Test(dataProvider="getData")
    public void loginTest(String email,String password) throws InterruptedException {
        driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[contains(text(),'Login')]")).click();
        // PageObject we will locate this element and seprate out click action -> we will create click() method
        Thread.sleep(1000);
        driver.quit();
    }

}
