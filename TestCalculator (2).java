package u10216027_calculator;
//import the JButton
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JTextField;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalculator extends javax.swing.JFrame {
	// declare the varibles which I will use
	private String number = "";
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	private JButton equal;
	private JButton root;
	private JButton square;
	private JButton log;
	private JButton naturalLog;
	private JButton c;
	private JButton sin;
	private JButton cos;
	private JButton tan;
	private JButton plus;
	private JButton subtract;
	private JButton multiplication;
	private JButton division;
	private JButton spot;
	private JPanel p1;
	private JPanel p2;
	private JTextField show;
	private static double Sum = 0;
	// The constructor of this class
	public TestCalculator() {
		// set the title
		super("Calculater");
		// Let it have default close
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		// new the JPanel
		p1 = new JPanel();
		// Let the JFrame contain the JPanel p1
		this.setContentPane(p1);
		// Make the Panel GridLayout..
		p1.setLayout(new GridLayout(4, 6, 10, 10));
		
		b1 = new JButton("1");
		// Let the element be contained the Panel
		p1.add(b1);

		b2 = new JButton("2");
		// Let the element be contained the Panel
		p1.add(b2);

		b3 = new JButton("3");
		// Let the element be contained the Panel
		p1.add(b3);

		plus = new JButton("+");
		// Let the element be contained the Panel
		p1.add(plus);

		sin = new JButton("sinx");
		// Let the element be contained the Panel
		p1.add(sin);

		c = new JButton("C");
		// Let the element be contained the Panel
		p1.add(c);

		b4 = new JButton("4");
		// Let the element be contained the Panel
		p1.add(b4);

		b5 = new JButton("5");
		// Let the element be contained the Panel
		p1.add(b5);

		b6 = new JButton("6");
		// Let the element be contained the Panel
		p1.add(b6);

		subtract = new JButton("-");
		// Let the element be contained the Panel
		p1.add(subtract);

		cos = new JButton("cosx");
		// Let the element be contained the Panel
		p1.add(cos);

		square = new JButton("x^2");
		// Let the element be contained the Panel
		p1.add(square);

		b7 = new JButton("7");
		// Let the element be contained the Panel
		p1.add(b7);

		b8 = new JButton("8");
		// Let the element be contained the Panel
		p1.add(b8);

		b9 = new JButton("9");
		// Let the element be contained the Panel
		p1.add(b9);

		multiplication = new JButton("X");
		// Let the element be contained the Panel
		p1.add(multiplication);

		tan = new JButton("tanx");
		// Let the element be contained the Panel
		p1.add(tan);

		log = new JButton("logx");
		// Let the element be contained the Panel
		p1.add(log);

		equal = new JButton("=");
		// Let the element be contained the Panel
		p1.add(equal);

		b0 = new JButton("0");
		// Let the element be contained the Panel
		p1.add(b0);

		spot = new JButton(".");
		// Let the element be contained the Panel
		p1.add(spot);

		division = new JButton("/");
		// Let the element be contained the Panel
		p1.add(division);

		root = new JButton("กิ");
		// Let the element be contained the Panel
		p1.add(root);

		naturalLog = new JButton("lnx");
		// Let the element be contained the Panel
		p1.add(naturalLog);
		
		// new the JPanel
		p2 = new JPanel();
		// Make the Panel BorderLayout..
		p2.setLayout(new BorderLayout());
		// Let the JFrame contain the JPanel p2
		this.setContentPane(p2);

		show = new JTextField();
		// Let the element be contained the Panel and let it set the seat that I want it where
		p2.add(show, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		// set the event when I click the button b1
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "1";
				show.setText(number);
			}

		});
		// set the event when I click the button b2
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "2";
				show.setText(number);
			}

		});
		// set the event when I click the button b3
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "3";
				show.setText(number);
			}

		});
		// set the event when I click the button b4
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "4";
				show.setText(number);
			}

		});
		// set the event when I click the button b5
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "5";
				show.setText(number);
			}

		});
		// set the event when I click the button b6
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "6";
				show.setText(number);
			}

		});
		// set the event when I click the button b7
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "7";
				show.setText(number);
			}

		});
		// set the event when I click the button b8
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "8";
				show.setText(number);
			}

		});
		// set the event when I click the button b9
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "9";
				show.setText(number);
			}

		});
		// set the event when I click the button b0
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "0";
				show.setText(number);
			}

		});
		// set the event when I click the button spot
		spot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += ".";
				show.setText(number);
			}

		});
		// set the event when I click the button plus
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Sum = Double.parseDouble(number);
					show.setText("");
					number = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum += Double.parseDouble(number);
							show.setText(Sum + "");
							number = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		// set the event when I click the button subtract
		subtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(number);
					show.setText(Sum + "");
					number = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum -= Double.parseDouble(number);
							show.setText(Sum + "");
							number = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		// set the event when I click the button multiplication
		multiplication.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Sum = Double.parseDouble(number);
					show.setText("");
					number = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum *= Double.parseDouble(number);
							show.setText(Sum + "");
							number = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		// set the event when I click the button divsion
		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					Sum = Double.parseDouble(number);
					show.setText("");
					number = "";

				} catch (Exception a) {

				}

				equal.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
							Sum /= Double.parseDouble(number);
							show.setText(Sum + "");
							number = "";
						} catch (Exception a) {

						}
					}
				});
			}

		});
		// set the event when I click the button c
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Sum = 0;
				number = "";
				show.setText("");
			}

		});
		// set the event when I click the button sin
		sin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.sin(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		// set the event when I click the button cos
		cos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.cos(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		// set the event when I click the button tan
		tan.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.tan(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		// set the event when I click the button log
		log.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.log10(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		// set the event when I click the button naturalLog
		naturalLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.log(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		// set the event when I click the button root
		root.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.sqrt(Sum) + "");
				} catch (Exception b) {

				}
			}

		});
		// set the event when I click the button squre
		square.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Sum = Double.parseDouble(show.getText());
					show.setText(Math.pow(Sum,2) + "");
				} catch (Exception b) {

				}
			}

		});
		//set the JFrame Size
		this.setSize(500, 400);
		//Let the JFrame center
		this.setLocationRelativeTo(null);
		//Let JFrame be visible
		this.setVisible(true);
	}

	
}
