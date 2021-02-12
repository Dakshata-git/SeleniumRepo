package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
    String message = "Manisha";

    @Test(enabled = false)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = "Manisha";
        System.out.println(message);
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Manisha";
        System.out.println(message);
    }
}