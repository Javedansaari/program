public class TestShutDownAnonymousClass {
    public static void main(String args[]) throws Exception{
        
        Runtime obj = Runtime.getRuntime();
        obj.addShutdownHook(new Thread(){
            public void run(){
                System.out.println(" anonymous class with shut down hook ");
            }
        });

        try {
            System.out.println("\n main class sleeping... press ctrl+c to exit or wait for 3 seconds ");
            Thread.sleep(3000);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
