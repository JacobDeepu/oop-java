import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener {
	JFrame F;
	JTextField T;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bAdd, bSub, bMul, bDiv, bEq;

	static double a = 0, b = 0, c = 0;
	static int operator;

	Calculator() {
		F = new JFrame("Calculator");
		T = new JTextField();
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bAdd = new JButton("+");
		bSub = new JButton("-");
		bMul = new JButton("*");
		bDiv = new JButton("/");
		bEq = new JButton("=");

		T.setBounds(20, 20, 240, 20);
		b7.setBounds(20, 50, 45, 45);
		b8.setBounds(85, 50, 45, 45);
		b9.setBounds(150, 50, 45, 45);

		b4.setBounds(20, 100, 45, 45);
		b5.setBounds(85, 100, 45, 45);
		b6.setBounds(150, 100, 45, 45);
		bAdd.setBounds(215, 100, 45, 45);

		b1.setBounds(20, 150, 45, 45);
		b2.setBounds(85, 150, 45, 45);
		b3.setBounds(150, 150, 45, 45);
		bSub.setBounds(215, 150, 45, 45);

		b0.setBounds(20, 200, 45, 45);
		bEq.setBounds(85, 200, 45, 45);
		bDiv.setBounds(150, 200, 45, 45);
		bMul.setBounds(215, 200, 45, 45);

		F.add(T);
		F.add(b0);
		F.add(b1);
		F.add(b2);
		F.add(b3);
		F.add(b4);
		F.add(b5);
		F.add(b6);
		F.add(b7);
		F.add(b8);
		F.add(b9);
		F.add(bAdd);
		F.add(bSub);
		F.add(bMul);
		F.add(bDiv);
		F.add(bEq);

		F.setLayout(null);
		F.setVisible(true);
		F.setSize(280, 340);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bEq.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1)
			T.setText(T.getText().concat("1"));
		if (e.getSource() == b2)
			T.setText(T.getText().concat("2"));
		if (e.getSource() == b3)
			T.setText(T.getText().concat("3"));
		if (e.getSource() == b4)
			T.setText(T.getText().concat("4"));
		if (e.getSource() == b5)
			T.setText(T.getText().concat("5"));
		if (e.getSource() == b6)
			T.setText(T.getText().concat("6"));
		if (e.getSource() == b7)
			T.setText(T.getText().concat("7"));
		if (e.getSource() == b8)
			T.setText(T.getText().concat("8"));
		if (e.getSource() == b9)
			T.setText(T.getText().concat("9"));
		if (e.getSource() == b0)
			T.setText(T.getText().concat("0"));

		if (e.getSource() == bAdd) {
			a = Double.parseDouble(T.getText());
			operator = 1;
			T.setText("");
		}

		if (e.getSource() == bSub) {
			a = Double.parseDouble(T.getText());
			operator = 2;
			T.setText("");
		}

		if (e.getSource() == bMul) {
			a = Double.parseDouble(T.getText());
			operator = 3;
			T.setText("");
		}

		if (e.getSource() == bDiv) {
			a = Double.parseDouble(T.getText());
			operator = 4;
			T.setText("");
		}

		if (e.getSource() == bEq) {
			b = Double.parseDouble(T.getText());

			switch (operator) {
				case 1:
					c = a + b;
					break;
				case 2:
					c = a - b;
					break;
				case 3:
					c = a * b;
					break;
				case 4:
					try {
						c = a / b;
					} catch (ArithmeticException ex) {
						System.out.println(ex);
					}
					break;
			}

			T.setText(Double.toString(c));

		}
	}

	public static void main(String[] args) {
		new Calculator();
	}
}