import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    int x=0,y=0;
    int speedx=10;
    int speedy=10;
    int max_x;
    int max_y;
    Panel(int x,int y){
        max_x=x-50;
        max_y=y-50;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillOval(x,y,50,50);
        if(max_x<x ||x<0){
            speedx=-speedx;
        }
        if(max_y<y||y<0){
            speedy=-speedy;
        }
        x+=speedx;
        y+=speedy;
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        repaint();
    }
}
