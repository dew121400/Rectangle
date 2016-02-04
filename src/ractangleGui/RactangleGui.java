package ractangleGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import Object.Contains;
import Object.Rectangle;
import Object.points;
import Opperation.Functions;
import javax.swing.JLabel;

public class RactangleGui {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */

	public void Tempmain(String[] args) {
		System.out.println("here");
		Functions fun = new Functions();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RactangleGui window = new RactangleGui(fun);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public RactangleGui(Functions fun) {

		initialize(fun);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Functions fun) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText() + "  " + fun.ContainsLetter(textField.getText()));
				if (fun.ContainsLetter(textField.getText()) && fun.ContainsLetter(textField_4.getText())) {
					
					points A = new points(Double.parseDouble(textField.getText()),
							Double.parseDouble(textField_4.getText()));
					if (fun.ContainsLetter(textField_1.getText()) && fun.ContainsLetter(textField_5.getText())) {
						
						points B = new points(Double.parseDouble(textField_1.getText()),
								Double.parseDouble(textField_5.getText()));
						if (fun.ContainsLetter(textField_2.getText()) && fun.ContainsLetter(textField_6.getText())) {
							
							points C = new points(Double.parseDouble(textField_2.getText()),
									Double.parseDouble(textField_6.getText()));
							if (fun.ContainsLetter(textField_3.getText())
									&& fun.ContainsLetter(textField_7.getText())) {
								
								points D = new points(Double.parseDouble(textField_3.getText()),
										Double.parseDouble(textField_7.getText()));
								if (fun.ContainsLetter(textField_8.getText())
										&& fun.ContainsLetter(textField_12.getText())) {
									
									points A1 = new points(Double.parseDouble(textField_8.getText()),
											Double.parseDouble(textField_12.getText()));
									if (fun.ContainsLetter(textField_9.getText())
											&& fun.ContainsLetter(textField_13.getText())) {
										
										points B1 = new points(Double.parseDouble(textField_9.getText()),
												Double.parseDouble(textField_13.getText()));
										if (fun.ContainsLetter(textField_10.getText())
												&& fun.ContainsLetter(textField_14.getText())) {
											
											points C1 = new points(Double.parseDouble(textField_10.getText()),
													Double.parseDouble(textField_14.getText()));
											if (fun.ContainsLetter(textField_11.getText())
													&& fun.ContainsLetter(textField_15.getText())) {
												
												points D1 = new points(Double.parseDouble(textField_11.getText()),
														Double.parseDouble(textField_15.getText()));
												Rectangle rec1 = new Rectangle(A, B, C, D);
												Rectangle rec2 = new Rectangle(A1, B1, C1, D1);

												fun.Setup(rec1);
												fun.Setup(rec2);

												Contains contain = new Contains();
												// System.out.println("this is
												// rec 2 "
												// +rec2.getC().GetString());
												fun.CompareToContained(rec1, rec2, contain);

												fun.compareTointersect(rec1, rec2, contain);
												String message = "";
												if(contain.iscontain)
												{
													message = message + "the rectangle is contain within the other rectangle. "; 
												}
												if(contain.ajents != 0)
												{
													message = message + "these rectangles have adjacent lines. ";
												}
												if(contain.intercept!=0)
												{
													message = message + "these rectangles have lines the intercept";
												}
												try {
													RecDrawing windows = new RecDrawing(message, rec1, rec2);
													windows.frame.setVisible(true);
												} catch (Exception u) {
													u.printStackTrace();
												}
												JOptionPane.showMessageDialog(null,
														message);
												System.out.println(message);
												
												
											}
											else{
												JOptionPane.showMessageDialog(null, "must only be numbers");
											}
										}
										else{
											JOptionPane.showMessageDialog(null, "must only be numbers");
										}
									}
									else{
										JOptionPane.showMessageDialog(null, "must only be numbers");
									}
								}
								else{
									JOptionPane.showMessageDialog(null, "must only be numbers");
								}
							}
							else{
								JOptionPane.showMessageDialog(null, "must only be numbers");
							}
						}
						else{
							JOptionPane.showMessageDialog(null, "must only be numbers");
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "must only be numbers");
					}
				}
				else{
				
					JOptionPane.showMessageDialog(null, "must only be numbers");
					
				}
			}
			
		});
		btnInsert.setBounds(44, 210, 117, 29);
		frame.getContentPane().add(btnInsert);

		textField = new JTextField();
		textField.setBounds(69, 36, 65, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(69, 74, 65, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(69, 112, 65, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(69, 150, 65, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(135, 36, 65, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(135, 74, 65, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(135, 112, 65, 26);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(135, 148, 65, 26);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(244, 36, 65, 26);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(244, 74, 65, 26);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(244, 112, 65, 26);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(244, 150, 65, 26);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);

		textField_12 = new JTextField();
		textField_12.setBounds(314, 36, 65, 26);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setBounds(314, 74, 65, 26);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setBounds(314, 112, 65, 26);
		frame.getContentPane().add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setBounds(314, 148, 65, 26);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);

		JLabel lblNewLabel = new JLabel("Rectangle 1 ");
		lblNewLabel.setBounds(91, 8, 109, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Rectangle 2");
		lblNewLabel_1.setBounds(244, 8, 109, 16);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblX = new JLabel("x");
		lblX.setBounds(73, 21, 61, 16);
		frame.getContentPane().add(lblX);

		JLabel lblY = new JLabel("y");
		lblY.setBounds(146, 21, 61, 16);
		frame.getContentPane().add(lblY);

		JLabel lblX_1 = new JLabel("x");
		lblX_1.setBounds(248, 21, 61, 16);
		frame.getContentPane().add(lblX_1);

		JLabel lblY_1 = new JLabel("y");
		lblY_1.setBounds(321, 21, 61, 16);
		frame.getContentPane().add(lblY_1);

		JLabel lblPoint = new JLabel("point 1");
		lblPoint.setBounds(6, 41, 61, 16);
		frame.getContentPane().add(lblPoint);

		JLabel lblPoint_1 = new JLabel("point 2");
		lblPoint_1.setBounds(10, 79, 61, 16);
		frame.getContentPane().add(lblPoint_1);

		JLabel lblPoint_2 = new JLabel("point 3");
		lblPoint_2.setBounds(6, 117, 61, 16);
		frame.getContentPane().add(lblPoint_2);

		JLabel lblPoint_3 = new JLabel("point 4");
		lblPoint_3.setBounds(10, 155, 61, 16);
		frame.getContentPane().add(lblPoint_3);
	}
}
