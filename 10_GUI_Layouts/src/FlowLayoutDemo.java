import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

	public FlowLayoutDemo() {

		this.setTitle("Flow Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 640);
		this.setLocationRelativeTo(null);

		this.setLayout(new FlowLayout(FlowLayout.CENTER));



		for (int i = 1; i < 20; i++) {
			this.add(new JButton("Button " + i));
		}

		this.setVisible(true);
	}
}
