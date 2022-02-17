public class DaemonThreadExample extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("\nDaemon thread is working ");
        }else{
            System.out.println("\nUser thread is working ");
        }
    }
    public static void main(String args[]){
        DaemonThreadExample obj1 = new DaemonThreadExample();
        DaemonThreadExample obj2 = new DaemonThreadExample();
        DaemonThreadExample obj3 = new DaemonThreadExample();

        obj1.setDaemon(true);
        
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
