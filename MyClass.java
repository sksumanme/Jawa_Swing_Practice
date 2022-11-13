import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyClass implements ActionListener {
    JFrame frame;
    MyClass(){
        frame=new JFrame("Frame");
        frame.setSize(500,600);
        Container c=frame.getContentPane();
        c.setBackground(Color.lightGray);
        Panel panel=new Panel(500,600);
        panel.setBackground(Color.green);
        frame.add(panel);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyClass obj=new MyClass();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
