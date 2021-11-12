package inputDialog;

import javax.swing.JOptionPane;

public class InputDialogDemo {

	public static void inputDialog() {

		String input = JOptionPane.showInputDialog("Test");
		System.out.println(input);

	}

	public static void inputDialogDefault() {

		String input = JOptionPane.showInputDialog("Test","testVorgabe");
		System.out.println(input);
	}
	
	
	public static void inputDialogDropdown() {

		String options[] = {"erste Option", "zweite Option", "noch eine"};
		String input = (String) JOptionPane.showInputDialog(null, "Bitte auswählen xyz", "Meintitel", JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
		System.out.println(input);
	}

	
	
}
