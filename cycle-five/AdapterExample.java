import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends KeyAdapter {
    Frame f;
    TextArea a;
    Label l;

    AdapterExample() {
        f = new Frame("Adapter Example");
        a = new TextArea();
        l = new Label();
        a.setBounds(20, 80, 300, 300);
        l.setBounds(20, 50, 200, 20);
        f.add(a);
        f.add(l);
        a.addKeyListener(this); 
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String str = a.getText();
        String words[] = str.split("\\s");
        l.setText("Word Count: " + words.length);
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}