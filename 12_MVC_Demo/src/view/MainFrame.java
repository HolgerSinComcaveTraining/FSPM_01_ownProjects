package view;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private MainPanel contentPanel = new MainPanel();
	
	public MainFrame() {
		this.setTitle("MVC Demo");
		this.setResizable(true);
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(contentPanel);
	}

	public MainPanel getContenPanel() {
		return contentPanel;
	}
	
	
	

}
