package sheet_wrapper;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class IntCell extends JTextField implements KeyListener {
    private int value = 0;
    public IntCell(int v) {
        super(String.valueOf(v), 10);
        value = v;
        addKeyListener(this);
    }
    public void setValue(int v) {
        value = v;
        setText(String.valueOf(v));
    }
    public int getValue() {
        return value;
    }
    public void keyTyped(KeyEvent e) {
    }
    public void keyPressed(KeyEvent e) {
    }
    public void keyReleased(KeyEvent e) {
        String str = getText();
        setValue(str.isEmpty() ? 0 : Integer.valueOf(str));
    }
}
