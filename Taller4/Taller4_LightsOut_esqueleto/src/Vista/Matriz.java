package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class Matriz extends JPanel {
	private int rows;
	private int width;

    
    public Matriz(int rows, int width) {
    	this.rows=rows;
    	this.width=width;
    	this.setPreferredSize(new Dimension(500,500));
}
    public void paint(Graphics g)
    {
    	
    	
    	
    	Graphics2D g2D = (Graphics2D) g;
    	int valor= 500/rows;
    	for (int val=0; val<rows; val++)
        {
    		for(int val1=0; val1<rows; val1++)
    		{g2D.setPaint(Color.yellow);	
            g2D.fillRect(val*valor, val1*valor, valor-5, valor-5);}
    
        }
    }
    public void update(int rows, int width)
    {
    	this.rows=rows;
    	this.width=width;
    	repaint();
    	
    }
    public void update2(int rows, int width)
    {
    	this.rows=rows;
    	this.width=width;
    	repaint();
    	
    }
    
    
}