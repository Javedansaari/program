class MyThread extends Thread{
    public void run(){
        System.out.println("\n test of shut down hook in java ");
    }
}

public class TestShutDown {
    public static void main(String args[]) throws Exception{
        
        Runtime obj = Runtime.getRuntime();
        obj.addShutdownHook(new MyThread());

        System.out.println("please press ctrl+c to exit");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
