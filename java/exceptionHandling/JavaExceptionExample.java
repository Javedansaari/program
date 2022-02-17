class JavaExceptionExample{
    public static void main(String args[]){
        try {
            int data = 10/0;
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("\n divide by zero is not allowed ");
    }
}