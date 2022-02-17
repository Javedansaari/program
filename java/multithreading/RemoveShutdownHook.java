public class RemoveShutdownHook {

    static class Msg extends Thread{
        public void run(){
            System.out.println("removing of shutdown hook ");
        }
    }

    public static void main(String args[]){
        try {
            Msg ms = new Msg();
            
            Runtime.getRuntime().addShutdownHook(ms);
            System.out.println("shut down hook has been added");

            System.out.println("wait for 3 second ");
            Thread.sleep(3000);
            Runtime.getRuntime().removeShutdownHook(ms);

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
