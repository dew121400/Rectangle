package ractangleGui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.color.*;
import javax.swing.JFrame;
import javax.swing.JComponent;
import Object.Rectangle;

public class RecDrawing extends JComponent{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
	 public static Rectangle rec1;
	 public static Rectangle rec2;
	
	
	public void  Tempmain(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecDrawing window = new RecDrawing("nothing", rec1 ,rec2);
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
	public RecDrawing( String statement,  Rectangle rec1,  Rectangle rec2) {
		//paintComponents(g);
		System.out.println(" this has been called" );
		repaint();
		this.rec1= rec1;
		this.rec2 = rec2;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("x");
		frame = new JFrame();
		Davidline rac = new Davidline( "nothing", rec1 ,rec2);
		frame.add(rac);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height * 1 / 2;
		int width = screenSize.width * 1 / 2;
		frame.setBounds(100, 100, 450, 300);
		frame.setPreferredSize(new Dimension(width, height));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.repaint();
		
		
	}

}


