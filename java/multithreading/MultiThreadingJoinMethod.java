import java.io.*;

class MultiThread extends Thread{
    public void run(){
        for(int i = 0 ; i<2 ; i++){
            try {
                Thread.sleep(500);
                System.out.println("the current thread name is " + Thread.currentThread().getName());
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class MultiThreadingJoinMethod {
    public static void main(String args[]){
        MultiThread obj1 = new MultiThread();
        MultiThread obj2 = new MultiThread();
        MultiThread obj3 = new MultiThread();

        obj1.start();

        try {
            System.out.println("\n the current thread name is " + Thread.currentThread().getName());
            obj1.join();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("the exception has been caught ");
        }

        obj2.start();
        
        try {
            System.out.println("\n the current thread name is "+ Thread.currentThread().getName());
            obj2.join();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("the exception has been caught ");
        }

        obj3.start();

    }
}
