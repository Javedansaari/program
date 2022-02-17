class ThreadNew extends Thread{
    ThreadNew(String tName, ThreadGroup tgrp){
        super(tgrp,tName);
        start();
    }

    public void run(){
        for(int i = 0 ; i < 100 ; i++){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                //TODO: handle exception
                System.out.println("\n interrupted Exception handled "+ e);
            }
        }
        System.out.println(Thread.currentThread().getName()+ "thread finished executing");
    }
}

public class ThreadisDestroyed {
    public static void main(String args[]) throws SecurityException, InterruptedException{
        ThreadGroup tg = new ThreadGroup("this is the parent group ");
        ThreadGroup tg1 = new ThreadGroup("this is the child group ");

        ThreadNew obj1 = new ThreadNew("one", tg);
        System.out.println("\n this is first one ");

        ThreadNew obj2 = new ThreadNew("two", tg);
        System.out.println("\n this is the second one ");

        if(tg.isDestroyed() == true){
            System.out.println("\n the thread has been destroyed ");
        }else{
            System.out.println("\n the thread has not been destroyed yet ");
        }
    }
}
