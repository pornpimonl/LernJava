package lesson15;

import java.awt.*;
import java.awt.event.*;

public class MyFrammeAndPanel {
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        Panel p = new Panel();
        p.setBackground(Color.CYAN);
        p.setSize(100, 50);
        f.setBackground(Color.black);
        f.setLayout(null);
        f.setSize(200, 100);
        f.add(p);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
