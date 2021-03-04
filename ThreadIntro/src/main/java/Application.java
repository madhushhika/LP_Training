public class Application {

    public static void main(String args[]){

        Printer printer =new Printer();
       // printer.start();
     //   System.out.println("I am from main ");
        System.out.println("main  before" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        
        Thread thread =new Thread(printer);
        Thread tread2 = new Thread("threadOne");
        
        
        thread.setPriority(10);
        System.out.println("main  " + Thread.currentThread().getPriority());
        System.out.println("Child  " + thread.getPriority());
        thread.start();
        
        
        
       // tread2.start();
        
        for (int i = 0; i < 50; i++) {
            System.out.println("main  " + Thread.currentThread().getName()+i);
        }
        System.out.println("===============================================");
    }
}
