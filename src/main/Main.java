package main;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import Object.Contains;
import Object.Rectangle;
import Object.points;
import Opperation.Functions;
import ractangleGui.RactangleGui;


public class Main {

	public static void main(String[] args) {
		
		Functions fun = new Functions();
		/*
		 * for running the test
		 */
		if(args.length==0)
		{
		points A = new points(4,4);
		points B = new points(4,0);
		points C = new points(0,0);
		points D = new points(0,4);
		points A1 = new points(5,5);
		points B1= new points(2,1);
		points C1 = new points(1,2);
		points D1 = new points(1,1);
		
		Rectangle rec1= new Rectangle(A, B, C, D); 
		Rectangle rec2= new Rectangle(A1, B1, C1, D1);
		
		fun.Setup(rec1);
		fun.Setup(rec2);
		
		
		Contains contain = new Contains();
		//System.out.println("this is rec 2 " +rec2.getC().GetString());
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
		System.out.println("the gualities of these two rectangles are : " + message);

		}
		/* 
		 * for running on cammand line
		 * 
		 */
		else if (args[0].compareTo("cmd")==0)
		{
			System.out.println(args.length);
			if(args.length==17)
			{
				/*
				 * testing to see if points are valid if so setting points
				 */
					if (fun.ContainsLetter(args[1]) && fun.ContainsLetter(args[2])) {
					points A = new points(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
						
					if (fun.ContainsLetter(args[3]) && fun.ContainsLetter(args[4])) {
						points B = new points(Double.parseDouble(args[3]),Double.parseDouble(args[4]));
						if (fun.ContainsLetter(args[5]) && fun.ContainsLetter(args[6])) {
							points C = new points(Double.parseDouble(args[5]),Double.parseDouble(args[6]));
							if (fun.ContainsLetter(args[7])
									&& fun.ContainsLetter(args[8])) {
								points D = new points(Double.parseDouble(args[7]),Double.parseDouble(args[8]));
								if (fun.ContainsLetter(args[9])
										&& fun.ContainsLetter(args[10])) {
									points A1 = new points(Double.parseDouble(args[9]),Double.parseDouble(args[10]));
									if (fun.ContainsLetter(args[11])
											&& fun.ContainsLetter(args[12])) {
										points B1= new points(Double.parseDouble(args[11]),Double.parseDouble(args[12]));
										if (fun.ContainsLetter(args[13])
												&& fun.ContainsLetter(args[14])) {
											points C1 = new points(Double.parseDouble(args[13]),Double.parseDouble(args[14]));
											if (fun.ContainsLetter(args[15])
													&& fun.ContainsLetter(args[16])) {
												points D1 = new points(Double.parseDouble(args[15]),Double.parseDouble(args[16]));
												Rectangle rec1= new Rectangle(A, B, C, D); 
												Rectangle rec2= new Rectangle(A1, B1, C1, D1);

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
												System.out.println("the gualities of these two rectangles are : " + message);
											}
											else{
												System.out.println("must only be numbers");
											}
										}
										else{
											System.out.println("must only be numbers");
										}
									}
									else{
										System.out.println("must only be numbers");
									}
								}
								else{
									System.out.println("must only be numbers");
								}
							}
							else{
								System.out.println("must only be numbers");
							}
						}
						else{
							System.out.println("must only be numbers");
						}
					}
					else{
						System.out.println("must only be numbers");
					}
				}
				else{
				
					System.out.println("must only be numbers");
					
				}

			}
		}
		/*
		 * for GUI
		 */
			else if (args[0].compareTo("gui")==0)
			{
				
			
				try {
					RactangleGui window = new RactangleGui(fun);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						
					}
				});
				return;
			}
		
		
		}
	

}
