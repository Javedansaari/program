public class TestMultipleTask {
    public static void main(String args[]){
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("\n first thread");
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("\n second thread.");
            }
        };
        
        t1.start();
        t2.start();
    }
}
