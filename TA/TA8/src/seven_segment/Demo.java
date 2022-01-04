package seven_segment;

import javax.swing.*;
import java.awt.*;

// references:
// https://www.javatpoint.com/java-jpanel
// https://kiunwong.blogspot.com/2012/09/seven-segments-display-in-java.html


public class Demo {
    public static void main(String args[]) {
        SevenSegmentDisplay display = new SevenSegmentDisplay();
        JFrame f= new JFrame("Seven segment display");
        f.add(display);
        //f.setLayout();
        f.setSize(400,400);
        f.setVisible(true);
        try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        display.setState(new Digit_7());
        display.repaint();
    }

}
