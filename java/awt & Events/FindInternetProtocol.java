import java.awt.*;
import java.awt.event.*;

public class FindInternetProtocol extends Frame implements ActionListener{
    
    Label l;
    Button b;
    TextField t;

    FindInternetProtocol(){
        //Frame f = new Frame("find ip address ");

        l = new Label();
        l.setBounds(50,100,350,20);

        b = new Button("click here");
        b.setBounds(50,150,80,30);
        b.addActionListener(this);

        t = new TextField();
        t.setBounds(50,50,150,20);

        add(l);
        add(t);
        add(b);

        setTitle("find Ip Address");
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

        public void actionPerformed(ActionEvent e){
            try {
                String text = t.getText();
                String ip = java.net.InetAddress.getByName(text).getHostAddress();
                l.setText("ip of "+ text +" is "+ip);
            } catch (Exception ex) {
                //TODO: handle exception
                System.out.println(ex);
            }
        
        

    }

    public static void main(String args[]){
        new FindInternetProtocol();
    }
}
