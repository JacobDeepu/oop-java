import java.awt.event.*;
import javax.swing.*;

public class CheckBoxExample extends JFrame implements ActionListener {
    JCheckBox checkbox1, checkbox2;
    JTextField txt;

    CheckBoxExample() {
        checkbox1 = new JCheckBox("bit1");
        checkbox1.setBounds(100, 100, 50, 50);
        checkbox2 = new JCheckBox("bit0");
        checkbox2.setBounds(150, 100, 50, 50);
        txt = new JTextField();
        txt.setBounds(100, 150, 150, 20);
        JButton btn = new JButton("Submit");
        btn.setBounds(250, 150, 100, 20);

        add(checkbox1);
        add(checkbox2);
        add(txt);
        add(btn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        btn.addActionListener(this);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(checkbox1.isSelected() && checkbox2.isSelected())
            txt.setText("3");
        else if(checkbox1.isSelected())
            txt.setText("2");
        else if(checkbox2.isSelected())
            txt.setText("1");
        else
            txt.setText("0");
    }

    public static void main(String args[]) {
        new CheckBoxExample();
    }
}