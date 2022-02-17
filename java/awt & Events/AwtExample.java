import java.awt.*;

class AwtExample extends Frame{
    AwtExample(){
        Button b = new Button("click me");
        TextField t = new TextField("write here ");

        b.setBounds(100,90,100,30);
        t.setBounds(10,90 , 90,30);

        add(t);
        add(b);
        
        setSize(300,300);

        setTitle("using Frame");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]){
        AwtExample obj = new AwtExample();
    }
}