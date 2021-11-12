package messageDialog;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialogDemo {
	
	public static void messageDialog() {
		JOptionPane.showMessageDialog(null, "Testnachricht");
	}

	
	public static void messageDialogTitelMessageType() {
		JOptionPane.showMessageDialog(null, "Testnachricht (Warnung)", "Mein titel", JOptionPane.WARNING_MESSAGE);
	}

	
	public static void messageDialogTitelMessageTypeIcon() {
		
		ImageIcon icon = new ImageIcon("src/myIcon.png");
		Image image = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
//		Image newImage = image.getScaledInstance(64,64,Image.SCALE_SMOOTH);
//		 
		icon = new ImageIcon(image);
		
		JOptionPane.showMessageDialog(null, "Testnachricht (Frage)", "Mein titel", JOptionPane.QUESTION_MESSAGE, icon);
		
		
	}
}
