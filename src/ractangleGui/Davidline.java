package ractangleGui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Object.Rectangle;


public class Davidline extends JPanel{

	/**
	 * for drawing line of the rectangle
	 */
	private static final long serialVersionUID = 1L;
	public Rectangle rec1;
	public Rectangle rec2;
	public Davidline (String holder, Rectangle rec1,  Rectangle rec2)
	{
		this.rec1= rec1;
		this.rec2= rec2;
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	 public void paintComponent(Graphics g) {
		 super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		
		g.drawLine((int) rec1.getA().getX(), (int)rec1.getA().getY(), (int)rec1.getB().getX(),(int) rec1.getB().getY());
		g.drawLine((int) rec1.getB().getX(), (int)rec1.getB().getY(), (int)rec1.getC().getX(),(int) rec1.getC().getY());
		g.drawLine((int) rec1.getC().getX(), (int)rec1.getC().getY(), (int)rec1.getD().getX(),(int) rec1.getD().getY());
		g.drawLine((int) rec1.getD().getX(), (int)rec1.getD().getY(), (int)rec1.getA().getX(),(int) rec1.getA().getY());
		g.drawLine((int) rec2.getA().getX(), (int)rec2.getA().getY(), (int)rec2.getB().getX(),(int) rec2.getB().getY());
		g.drawLine((int) rec2.getB().getX(), (int)rec2.getB().getY(), (int)rec2.getC().getX(),(int) rec2.getC().getY());
		g.drawLine((int) rec2.getC().getX(), (int)rec2.getC().getY(), (int)rec2.getD().getX(),(int) rec2.getD().getY());
		g.drawLine((int) rec2.getD().getX(), (int)rec2.getD().getY(), (int)rec2.getA().getX(),(int) rec2.getA().getY());
	 }
}
