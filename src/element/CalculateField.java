package element;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import util.Calculate;

class MyActionListener implements ActionListener {

	private static String calculate = "";

	public void actionPerformed(ActionEvent e) {
		String button = ((JButton) e.getSource()).getText();

		switch (button) {
		case "C":
			calculate = "";
			CalculateField.resultField.setText(calculate);
			CalculateField.calculateField.setText(calculate);
			break;

		case "=":
			CalculateField.resultField.setText(Calculate.calculate(calculate));
			break;

		case "DEL":
			if (calculate.length() >= 1) {
				calculate = calculate.substring(0, calculate.length() - 1);
			}
			CalculateField.calculateField.setText(calculate);
			break;

		default:
			calculate += button;
			CalculateField.calculateField.setText(calculate);
		}
	}
}

public class CalculateField extends JPanel {

	private JPanel buttonField = new JPanel();
	static JLabel calculateField = new JLabel();
	static JLabel resultField = new JLabel();

	public CalculateField() {
		setLayout(new BorderLayout());

		resultField.setOpaque(true);
		buttonField.setOpaque(true);

		resultField.setBackground(Color.WHITE);
		buttonField.setBackground(Color.WHITE);

		calculateField.setForeground(Color.GRAY);

		calculateField.setPreferredSize(new Dimension(400, 50));
		resultField.setPreferredSize(new Dimension(400, 80));
		buttonField.setPreferredSize(new Dimension(400, 500));

		calculateField.setFont(new Font("Impact", Font.BOLD, 40));
		resultField.setFont(new Font("Impact", Font.BOLD, 70));

		calculateField.setHorizontalAlignment(JLabel.RIGHT);
		resultField.setHorizontalAlignment(JLabel.RIGHT);

		buttonField.setLayout(new GridLayout(5, 4, 3, 3));

		add(calculateField, BorderLayout.NORTH);
		add(resultField, BorderLayout.CENTER);
		add(buttonField, BorderLayout.SOUTH);

		JButton button1 = new JButton("C");
		JButton button2 = new JButton("");
		JButton button3 = new JButton("DEL");
		JButton button4 = new JButton("/");
		JButton button5 = new JButton("7");
		JButton button6 = new JButton("8");
		JButton button7 = new JButton("9");
		JButton button8 = new JButton("x");
		JButton button9 = new JButton("4");
		JButton button10 = new JButton("5");
		JButton button11 = new JButton("6");
		JButton button12 = new JButton("-");
		JButton button13 = new JButton("1");
		JButton button14 = new JButton("2");
		JButton button15 = new JButton("3");
		JButton button16 = new JButton("+");
		JButton button17 = new JButton("0");
		JButton button18 = new JButton("00");
		JButton button19 = new JButton(".");
		JButton button20 = new JButton("=");

		button1.addActionListener(new MyActionListener());
		button2.addActionListener(new MyActionListener());
		button3.addActionListener(new MyActionListener());
		button4.addActionListener(new MyActionListener());
		button5.addActionListener(new MyActionListener());
		button6.addActionListener(new MyActionListener());
		button7.addActionListener(new MyActionListener());
		button8.addActionListener(new MyActionListener());
		button9.addActionListener(new MyActionListener());
		button10.addActionListener(new MyActionListener());
		button11.addActionListener(new MyActionListener());
		button12.addActionListener(new MyActionListener());
		button13.addActionListener(new MyActionListener());
		button14.addActionListener(new MyActionListener());
		button15.addActionListener(new MyActionListener());
		button16.addActionListener(new MyActionListener());
		button17.addActionListener(new MyActionListener());
		button18.addActionListener(new MyActionListener());
		button19.addActionListener(new MyActionListener());
		button20.addActionListener(new MyActionListener());

		button1.setBackground(new Color(39, 42, 45));
		button2.setBackground(new Color(39, 42, 45));
		button3.setBackground(new Color(39, 42, 45));
		button4.setBackground(new Color(125, 177, 80));
		button5.setBackground(new Color(237, 242, 242));
		button6.setBackground(new Color(237, 242, 242));
		button7.setBackground(new Color(237, 242, 242));
		button8.setBackground(new Color(125, 177, 80));
		button9.setBackground(new Color(237, 242, 242));
		button10.setBackground(new Color(237, 242, 242));
		button11.setBackground(new Color(237, 242, 242));
		button12.setBackground(new Color(125, 177, 80));
		button13.setBackground(new Color(237, 242, 242));
		button14.setBackground(new Color(237, 242, 242));
		button15.setBackground(new Color(237, 242, 242));
		button16.setBackground(new Color(125, 177, 80));
		button17.setBackground(new Color(237, 242, 242));
		button18.setBackground(new Color(237, 242, 242));
		button19.setBackground(new Color(237, 242, 242));
		button20.setBackground(new Color(125, 177, 80));

		button1.setForeground(Color.WHITE);
		button3.setForeground(Color.WHITE);

		button1.setFont(new Font("", Font.BOLD, 30));
		button2.setFont(new Font("", Font.BOLD, 30));
		button3.setFont(new Font("", Font.BOLD, 25));
		button4.setFont(new Font("", Font.BOLD, 30));
		button5.setFont(new Font("", Font.BOLD, 30));
		button6.setFont(new Font("", Font.BOLD, 30));
		button7.setFont(new Font("", Font.BOLD, 30));
		button8.setFont(new Font("", Font.BOLD, 30));
		button9.setFont(new Font("", Font.BOLD, 30));
		button10.setFont(new Font("", Font.BOLD, 30));
		button11.setFont(new Font("", Font.BOLD, 30));
		button12.setFont(new Font("", Font.BOLD, 30));
		button13.setFont(new Font("", Font.BOLD, 30));
		button14.setFont(new Font("", Font.BOLD, 30));
		button15.setFont(new Font("", Font.BOLD, 30));
		button16.setFont(new Font("", Font.BOLD, 30));
		button17.setFont(new Font("", Font.BOLD, 30));
		button18.setFont(new Font("", Font.BOLD, 30));
		button19.setFont(new Font("", Font.BOLD, 30));
		button20.setFont(new Font("", Font.BOLD, 30));

		buttonField.add(button1);
		buttonField.add(button2);
		buttonField.add(button3);
		buttonField.add(button4);
		buttonField.add(button5);
		buttonField.add(button6);
		buttonField.add(button7);
		buttonField.add(button8);
		buttonField.add(button9);
		buttonField.add(button10);
		buttonField.add(button11);
		buttonField.add(button12);
		buttonField.add(button13);
		buttonField.add(button14);
		buttonField.add(button15);
		buttonField.add(button16);
		buttonField.add(button17);
		buttonField.add(button18);
		buttonField.add(button19);
		buttonField.add(button20);
	}
}
