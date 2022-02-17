import java.io.*;

class Parent{
    void msg()throws Exception{
        System.out.println("\n a message from parent class");
    }
}

public class TestThrowsExample2 extends Parent{
    
    void msg()throws ArithmeticException{
        System.out.println("\n a message from child class");
    }

    public static void main(String args[]){
        Parent obj = new TestThrowsExample2();
        
        try {
            obj.msg();
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("\n rest of the code");
    }
}
