package lesson15;

import java.awt.*;
import java.awt.event.*;

public class MyFrameAndDialoog {
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        Dialog d = new Dialog(f, "Dialog");
        Label l = new Label("Labal Labal Labal");
        d.add(l);
        d.pack();
        f.setSize(200, 100);
        f.setVisible(true);
        d.setVisible(true);
        d.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
