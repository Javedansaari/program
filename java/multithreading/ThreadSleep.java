public class ThreadSleep extends Thread {
    //threads created outside main method inside main class
    public void run(){
        for(int i = 0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //TODO: handle exception
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        
        ThreadSleep obj = new ThreadSleep();
        ThreadSleep obj1 = new ThreadSleep();

        obj.start();
        obj1.start();
    }
}
