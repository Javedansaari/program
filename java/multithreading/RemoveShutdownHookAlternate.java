public class RemoveShutdownHookAlternate {
    
    static class Msg extends Thread {
        public void run(){
            System.out.println("bye");
        }
    }

    public static void main(String args[]){
        try {
            Msg ms = new Msg();
            Runtime obj = Runtime.getRuntime();
            obj.addShutdownHook(ms);

            System.out.println("\n shut down hook has been added ");

            System.out.println("\n press ctrl+c to exit or wait for 3 seconds ");
            Thread.sleep(3000);
            obj.getRuntime().removeShutdownHook(ms);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
