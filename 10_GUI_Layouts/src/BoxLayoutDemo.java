import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame {

public BoxLayoutDemo(){
		
		
		this.setTitle("Box Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 640);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
		
//		this.getContentPane().setBackground(Color.pink);
		
		
		for (int i = 1; i < 20; i++) {
			this.add(new JButton("Button " + i));
		}
		
		
		this.setVisible(true);
	}
}
