class ThreadNew extends Thread{
    ThreadNew(String tName, ThreadGroup tgrp){
        super(tgrp, tName);
        start();
    }
    public void run(){
        for(int i = 0 ; i<100 ; i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                //TODO: handle exception
                System.out.println("\n interrupted exception is handled "+e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " \n the thread has finished its execution ");
    }
}

public class ThreadActiveCount {
    public static void main(String agrs[]){
        ThreadGroup tg = new ThreadGroup("parent thread group");
        ThreadGroup tg1 = new ThreadGroup("child thread group ");

        ThreadNew obj1 = new ThreadNew("one",tg);
        System.out.println("starting the first ");

        ThreadNew obj2 = new ThreadNew("two", tg);
        System.out.println("starting the second");

        System.out.println("\n the number of active threads are "+tg.activeGroupCount());
    }
}
