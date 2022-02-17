public class DeadLockExample {
    public static void main(String args[]){
        final String resource1 = "javed";
        final String resource2 = "ansari";

        Thread t1 = new Thread(){
            public void run(){
                synchronized(resource1){
                    System.out.println("Thread1: locked resource1 ");
                    try {
                    Thread.sleep(400);
                    } catch (Exception e) {
                    //TODO: handle exception
                    }

                    synchronized(resource2){
                        System.out.println("Thread1: locked resource 2");
                    }
                } 
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized(resource2){
                    System.out.println("Thread2: locked resource2 ");
                    try {
                        Thread.sleep(400);
                    } catch (Exception e) {
                        //TODO: handle exception
                    }
                    
                    synchronized(resource1){
                        System.out.println("Thread2: locked resource1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
