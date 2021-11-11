package optionDialog;

import javax.swing.JOptionPane;

public class OptionDialogDemo {

	public static void optionDialogStringOptions() {
		String options[] = {"Option1", "Option2"};
		int input = JOptionPane.showOptionDialog(null, "Mein Text", "Mein Titel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
		System.out.println(input);
		
	}
	
	public static void optionDialogIntegerOptions() {
		Integer options[] = {1,2,3,4,5};
		int input = JOptionPane.showOptionDialog(null, "Mein Text", "Mein Titel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
		System.out.println(input);
	}
	
	public static void optionDialogObjectOptions() {
		Object options[] = {'b',"Hallo",3,4.5};
		int input = JOptionPane.showOptionDialog(null, "Mein Text", "Mein Titel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
		System.out.println(input);
	}
}
