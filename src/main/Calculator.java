package main;

import java.awt.*;
import javax.swing.*;

import element.*;

public class Calculator extends JFrame {
	public Calculator() {
		setTitle("권준형 - 2020158002");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setSize(400, 600);
		setVisible(true);

		add(new CalculateField(),BorderLayout.CENTER);

		pack();
	}

	public static void main(String[] args) {
		new Calculator();
	}
}
