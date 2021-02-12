package SeleniumPackage;


class  Hi extends Thread
{
     public void run()  {
         for (int i=1;i<=5;i++) {
             System.out.println("Hi");
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
}

// hi hi hi hi hi , hello hello hello hello hello ->  one by one
// hi hello hi hello hi hello hi hello ..... extend thread


class Hell0 extends Thread
{
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Hi obj1 = new Hi();
        Hell0 obj2 = new Hell0();

        obj1.start();  // please start the thread
        obj2.start();  // please start the thread


        // start always call run method so change show to run class
        // public void run()

    }
}

// o/p

/*Hi
Hello
Hi
Hello
Hello
Hi
Hi
Hello
Hello
Hi
*/

/* we are starting both execution at the same time , but it will happen that both thread
reaches at the same time hence schedular will choose between two , based on critia it will execute one thread
like time , priority etc but if no criteria it will execute random
 */