//public class Printer extends Thread {
public class Printer implements Runnable {
    @Override
    public void run() {

        //  System.out.println("this is from child thread");
        for (int i = 0; i < 50; i++) {
            System.out.println("child" + i);
        }
    }
}
