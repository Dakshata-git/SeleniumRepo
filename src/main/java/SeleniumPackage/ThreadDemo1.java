package SeleniumPackage;


    class Hi1 implements Runnable {

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    class Hell01 implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class ThreadDemo1 {
        public static void main(String[] args) throws InterruptedException {
            Runnable obj1 = new Hi();
            Runnable obj2 = new Hell0();

            //obj1.start();
            //obj2.start();

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();
            // start always call run method so change show to run class
            // public void run()

        }
    }
