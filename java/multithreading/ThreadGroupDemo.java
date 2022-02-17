public class ThreadGroupDemo implements Runnable {

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup obj = new ThreadGroup("PARENT THREAD GROUP");

        Thread t1 = new Thread(obj,runnable,"one");
        t1.start();

        Thread t2 = new Thread(obj,runnable,"two");
        t2.start();

        Thread t3 = new Thread(obj,runnable,"three");
        t3.start();

        System.out.println("the name of the thread group is: "+ obj.getName());
        obj.list();
    }
}
