package com;
//import the GridLayout
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PassWord2 extends JFrame{
	// declare the varibles which I will use
	private JLabel keyPassWord;
	private JTextField password1;
	private JButton input1;
	private JPanel p2;
	
	String num;
	// The constructor of this class
	public PassWord2(String a){
		
	}
	
	// The non-arguement constructor of this class
	public PassWord2(){
		//set the title
		super("KeyPassWords");
		// Let it have default close
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		// new the JPanel
		p2 = new JPanel();
		// Let the JFrame contain the JPanel p1
		this.setContentPane(p2);
		// Make the Panel GridLayout..
		p2.setLayout(new GridLayout(1,3));

		keyPassWord = new JLabel("½Ð¿é¤J±K½X: ");
		// Let the element be contained the Panel
		p2.add(keyPassWord);

		password1 = new JTextField(15);
		// Let the element be contained the Panel
		p2.add(password1);

		input1 = new JButton("½T©w");
		// Let the element be contained the Panel
		p2.add(input1);
		
		
		// set the event when I click the button
		input1.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed(ActionEvent e){
				// set the event when I click the button
				//get the String on the TextField
				
				//new the PassWord Object
				PassWord ps = new PassWord(""); 
				//if passwords is true then open the Calculater
				if(password1.getText().equals(num)){
					try{
					Calculater cr = new Calculater();
					}catch(Exception a){
						
					}
				}
				//if passwords is false , let it retry .
				else{
					ps.main(null);
				}
			}
		});
		//set the JFrame Size
		this.setSize(500, 70);
		//Let the JFrame center
		this.setLocationRelativeTo(null);
		//Let JFrame be visible
		this.setVisible(true);
	}
	
}
