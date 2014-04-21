package com;

// import the GridLayout
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PassWord extends JFrame {
	// declare the varibles which I will use
	String keyWords;
	private JLabel setPassWord;

	private JTextField password;
	private JButton input;
	JPanel p1;

	// The constructor of this class
	public PassWord(String a) {

	}

	// The non-arguement constructor of this class
	public PassWord() {
		// set the title
		super("Pass words");
		// new the JPanel
		p1 = new JPanel();
		// Let the JFrame contain the JPanel p1
		this.setContentPane(p1);
		// Make the Panel GridLayout..
		p1.setLayout(new GridLayout(1, 3));
		// Let it have default close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setPassWord = new JLabel("請設定密碼: ");
		// Let the element be contained the Panel
		p1.add(setPassWord);

		password = new JTextField(15);
		// Let the element be contained the Panel
		p1.add(password);

		input = new JButton("確定");
		// Let the element be contained the Panel
		p1.add(input);

		// set the event when I click the button
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// set the event when I click the button
				//get the String on the TextField
				keyWords = password.getText().trim();
				PassWord2 ps = new PassWord2();
				//Let the password be mememoried in num which is in the PassWord2 class
				ps.num = keyWords;

			}
		});
		//set the JFrame Size
		this.setSize(500, 70);
		//Let the JFrame center
		this.setLocationRelativeTo(null);
		//Let JFrame be visible
		this.setVisible(true);

	}

	public static void main(String[] args) {
		//New the OBject of PassWord
		PassWord frame = new PassWord();

	}
}
