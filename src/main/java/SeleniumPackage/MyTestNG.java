package SeleniumPackage;

import Allure.AllureListener;
import Allure.BaseClass;
import io.qameta.allure.Severity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({AllureListener.class})
public class MyTestNG {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        BaseClass bs= new BaseClass();
        driver = bs.initialize_driver();
        driver.get("https://www.toolsqa.com/");

    }


    @Test
    public void f() {
        //String baseUrl = "https://www.toolsqa.com/";
        //System.out.println("Launching Google Chrome browser");
        //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Test On Chrome Browser");
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
        System.out.println("Finished Test On Chrome Browser");
    }
}
