class ABC extends Thread{
    Thread ThreadToInterrupt;
        public void run(){
            ThreadToInterrupt.interrupt();
        }
}

public class ThreadInterruptExample {
    public static void main(String args[]){
        ABC obj = new ABC();
        try {
            obj.ThreadToInterrupt = Thread.currentThread();
            obj.start();
            obj.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("interruted Exception handled  " );
        }
        System.out.println("\n execution of code");

    }
}
