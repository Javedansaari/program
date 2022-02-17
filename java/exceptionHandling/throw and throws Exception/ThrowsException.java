import java.util.Scanner;

class ExceptionHandling{
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("candidate not eligible");
        }else{
            System.out.println("please proceed for voting");
        }
    }
}

class ThrowsException{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n welcome to voting machine "+"\n");
        System.out.println("\n please enter your age  ");

        ExceptionHandling obj = new ExceptionHandling();
        int x = sc.nextInt();
        
        obj.validate(x);
        
       System.out.println("rest of the code");
    }
}