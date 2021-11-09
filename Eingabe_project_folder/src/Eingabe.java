import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner eingabe = new Scanner(System.in);
//		System.out.println("Bitte eingeben");
//		String text = "";
//		text = eingabe.nextLine();
//		System.out.println("Eingabe war: "+ text);
//		
//		System.out.println("Bitte Zahl eingeben");
//		int zahl = 1;
//		zahl = eingabe.nextInt();
//		System.out.println("Eingabe war: "+ zahl);
		
		
		
		
		
		String input = JOptionPane.showInputDialog("Bitte etwas eingeben", "Hallo");
		System.out.println(input);
		JOptionPane.showMessageDialog(null, input);
		
	}

}
