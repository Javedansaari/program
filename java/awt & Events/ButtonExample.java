import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String args[]){
        Frame f = new Frame();
        
        Button b = new Button("click here");
        final TextField tf = new TextField(" click on button");

        tf.setBounds(50,50,200,40);

        b.setBounds(90,100,100,40);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("\n welcome to java class ");
            }
        });

        f.add(b);
        f.add(tf);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
