package zaidimas;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
@SuppressWarnings("serial")


public class zaidimas extends JPanel {
	public static void main(String[] args) throws InterruptedException { 

		
		
			
			 new langas();
	    JLabel label = new JLabel("Welcome!", JLabel.CENTER);
	    	
	    
	    
	   
	        
	        label.setSize(new Dimension(200, 200));
	        label.add(label, BorderLayout.CENTER);
	        
	        label.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
	        label.setVisible(true);

	    
	    	       
	    }

	
	


	
	
	int x = 0;
	int y = 0;
	
	
	
private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
	int lebar = this.getWidth()/2;
	int tinggi = this.getHeight()/2;
	int x = (Toolkit.getDefaultToolkit().getScreenSize().width/2)-lebar;
	int y = (Toolkit.getDefaultToolkit().getScreenSize().height/2)-tinggi;
	this.setLocation(x, y); }
	    
	    
private void moveBall() {
	x = x + 1;
	y = y + 1;
	
}

@Override
public void paint(Graphics g) {
	super.paint(g);
	Graphics2D g2d = (Graphics2D) g;
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.fillOval(x, y, 20, 20);
	setBounds(54, 66, 500, 500);
	
}




	
	
		
	
		
	
		
	
	
	
	
	

	
}






	


