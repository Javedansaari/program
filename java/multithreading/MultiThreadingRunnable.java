public class MultiThreadingRunnable implements Runnable{
    public void run(){
        System.out.println("execution is prepared. ");
    }
    public static void main(String args[]){
        MultiThreadingRunnable obj = new MultiThreadingRunnable();
        Thread th = new Thread(obj);
        th.start();
    }
}
