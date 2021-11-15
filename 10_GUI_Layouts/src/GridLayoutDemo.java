import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{

	
	public GridLayoutDemo(){
		
		
		this.setTitle("Grid Layout");
		this.setLayout(new GridLayout(4, 4));
		this.setSize(640, 640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.pink);
		this.setLocationRelativeTo(null);
		
		
		for (int i = 1; i < 20; i++) {
			this.add(new JButton("Button " + i));
		}
		
		
		this.setVisible(true);
	}

	

}
