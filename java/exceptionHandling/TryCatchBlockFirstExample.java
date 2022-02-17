public class TryCatchBlockFirstExample {
    public static void main(String args[]){
        try {
            int data = 50/0;
            System.out.println("\n divide by zero is not allowed");
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
