import java.awt.*;
import java.awt.event.*;

public class TextFieldExample extends Frame implements ActionListener {

    Button b1,b2,b3,b4;
    TextField tf1,tf2,tf3;

    TextFieldExample(){

        tf1 = new TextField();
        tf1.setBounds(30,40,200,50);

        tf2 = new TextField();
        tf2.setBounds(30,100,200,50);

        tf3 = new TextField();
        tf3.setBounds(30,160,200,50);

        b1 = new Button("+");
        b1.setBounds(30,210,80,50);
        b1.addActionListener(this);
        
        b2 = new Button("-");
        b2.setBounds(115,210,80,50);
        b2.addActionListener(this);
        
        b3 = new Button("*");
        b3.setBounds(30,270,80,50);
        b3.addActionListener(this);

        b4 = new Button("/");
        b4.setBounds(115,270,80,50);
        b4.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(null);
        setVisible(true);
        setSize(400,400);

        //to close window on hitting close button
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        
        if(e.getSource() == b1){
            c = a+b;
        }else if(e.getSource() == b2){
            c = a-b;
        }else if(e.getSource() == b3){
            c = a*b;
        }else if(e.getSource() == b4){
            c = a/b;
        }
        String ans = String.valueOf(c);
        tf3.setText(ans);
    }
    public static void main(String args[]){
        new TextFieldExample();
    }
}
