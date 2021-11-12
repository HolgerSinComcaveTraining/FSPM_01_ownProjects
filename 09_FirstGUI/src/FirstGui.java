import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGui {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setSize(320, 640);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		frame.setLocation(300, 300);
//		
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setLocation(dim.width / 2 - frame.getWidth()/2, dim.height / 2 - frame.getHeight()/2);
//
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(new GridLayout(2, 2));
		
		JLabel label = new JLabel("Label Nr eins");
		
		JLabel label2 = new JLabel("Label Nr zwei");
		
		
		JButton button = new JButton("Drück mich");
		
					
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button gedrückt");
				label.setText("Button gedrückt");
			}
		});
		
		
//		button.addActionListener(e -> label2.setText("Mit Lambda"));
		
		button.addActionListener(new MyButtonListener());
		
		
		label.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Label gedrückt");
				label.setText(label.getText() + " +1 ");
				
			}
		});
		
		
		label2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Label2 gedrückt");
				label2.setText(label2.getText() + " +1 ");
				
			}
		});
		
		button.addKeyListener(new KeyAdapter() {
			public void keyTyped (KeyEvent e) {
				System.out.println(e.getKeyChar());
			}
		});
		
		frame.add(label);

		frame.add(label2);
		
		frame.add(button);
		
		
		frame.setVisible(true);
		

	}

}
