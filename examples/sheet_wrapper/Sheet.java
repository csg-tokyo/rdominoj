package sheet_wrapper;

import javax.swing.*;
import java.awt.*;

public class Sheet {
    private JFrame frame;
    public Sheet(String title, int rows, int cols) {
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(rows, cols));
    }
    public void setHeaders(String... headers) {
        for(int i=0; i<headers.length; i++) {
            frame.add(new JLabel(headers[i], SwingConstants.CENTER));
        }
    }
    public void add(IntCell c) {
        frame.add(c);
    }
    public void pack() {
        frame.pack();
    }
    public void show() {
        frame.setVisible(true);
    }
}
