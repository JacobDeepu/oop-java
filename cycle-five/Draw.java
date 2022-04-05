import java.awt.*;

import javax.swing.*;

//<applet code="Draw.class" height="250" width="250"></applet>
public class Draw extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.green);

        g.drawLine(15, 20, 350, 20);

        g.setColor(Color.blue);

        g.drawRect(15, 30, 90, 55);

        g.fillRect(120, 30, 90, 55);

        g.setColor(Color.red);

        g.drawOval(15, 100, 90, 55);

        g.fillOval(120, 100, 90, 55);

    }
}