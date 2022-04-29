import javax.swing.*;
import java.awt.event.*;

public class AddNum implements ActionListener {
    JFrame frame;
    JTextField num1, num2, res;
    JButton b0, b1;

    AddNum() {
        frame = new JFrame("Calculator");
        b0 = new JButton("+");
        b1 = new JButton("-");
        num1 = new JTextField("");
        num2 = new JTextField("");
        res = new JTextField("");

        b0.setBounds(130, 100, 50, 40);
        b1.setBounds(200, 100, 50, 40);
        num1.setBounds(10, 100, 100, 40);
        num2.setBounds(10, 200, 100, 40);
        res.setBounds(10, 300, 100, 40);

        frame.add(b0);
        frame.add(b1);
        frame.add(num1);
        frame.add(num2);
        frame.add(res);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(280, 340);

        b0.addActionListener(this);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());
        int c = 0;

        if (e.getSource() == b0)
            c = a + b;
        else if (e.getSource() == b1)
            c = a - b;
        res.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new AddNum();
    }
}
