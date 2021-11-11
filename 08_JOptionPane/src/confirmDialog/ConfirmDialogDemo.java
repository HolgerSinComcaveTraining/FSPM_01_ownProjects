package confirmDialog;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConfirmDialogDemo {

	public static void simpleConfirmDialog() {
		int input = JOptionPane.showConfirmDialog(null, "Test");
		System.out.println(input);
	}
	
	public static void confirmDialogTitleButtons() {
		int input = JOptionPane.showConfirmDialog(null, "Testtext", "Titel", JOptionPane.DEFAULT_OPTION);
		System.out.println(input);
		input = JOptionPane.showConfirmDialog(null, "Testtext", "Titel", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.println(input);
		input = JOptionPane.showConfirmDialog(null, "Testtext", "Titel", JOptionPane.YES_NO_OPTION);
		System.out.println(input);
		input = JOptionPane.showConfirmDialog(null, "Testtext", "Titel", JOptionPane.OK_CANCEL_OPTION);
		System.out.println(input);
	}

	public static void confirmDialogTitleButtonsMessageType() {
		int input = JOptionPane.showConfirmDialog(null, "Testtext", "Titel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
		System.out.println(input);
	}
	
	public static void confirmDialogTitleButtonsMessageTypeIcon() {
		ImageIcon icon = new ImageIcon("src/myIcon.png");
		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(64,64,Image.SCALE_SMOOTH);
		icon = new ImageIcon(newImage);
		int input = JOptionPane.showConfirmDialog(null, "Testtext", "Titel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE, icon);
		System.out.println(input);
	}
}
