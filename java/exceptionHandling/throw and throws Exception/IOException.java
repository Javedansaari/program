import java.io.IOException;

class IOException{
    void m() throws IOException{
        throw new IOException("device error");
    }

    void n() throws IOException{
        m();
    }

    void p()throws IOException{
        try {
            n();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("exception handled ");
        }
    }

    public static void main(String args[]){
        IOException obj = new IOException();
        obj.p();
        System.out.println("\n noirmal flow of code ");
    }
}