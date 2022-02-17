public class ThreadDirect {
    public static void main(String args[]){
        Thread obj = new Thread("thread is executing \n");
        obj.start();

        String str = obj.getName();
        System.out.print(str);
    }
}
