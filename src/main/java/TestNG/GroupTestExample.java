package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {
    String message = ".com";


    @Test(groups = { "regression", "sanity" })

    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        message = ".com";
        System.out.println(message);
    }

    @Test(groups = { "regression" })

    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "tutorialspoint" + ".com";
        System.out.println(message);

    }

    @Test(groups = { "Sanity" })

    public void testingExitMessage() {
        System.out.println("Inside testExitMessage()");
        message = "www." + "tutorialspoint"+".com";
        System.out.println(message);

    }
}