package TestNG;


import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {

    String message = ".com";

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage");
        System.out.println(message);
    }
    @Test(dependsOnMethods = {"thirdMethod"})
    public void testSalutationMessage(){
        System.out.println("Inside testSalutationMessage");
        message = "Hi" + " Nicholaas";
        System.out.println(message);
    }
    @Test
    public void thirdMethod(){
        System.out.println("Inside thirdMethod");
        message = "Hello" + " Nicholaas";
        System.out.println(message);
    }
}