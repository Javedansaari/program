public class TryCatchFinallyExample {
    public static void main(String args[]){
        try {
            int data = 1/0;
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("divide by zero is not allowed");
            System.out.println(e);
        }
        finally{
            System.out.println("\n finally is always executed");
        }
        System.out.println("\n rest of the code");
    }
}
