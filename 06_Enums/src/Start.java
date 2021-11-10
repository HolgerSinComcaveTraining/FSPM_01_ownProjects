import java.util.Iterator;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color c;
		c = Color.Red;
		
		for (Color tmpC : Color.values()) {
			System.out.println("Farbe "+ tmpC );
			System.out.println("Rot "+ tmpC.getRed() );
			System.out.println("Grün "+ tmpC.getGreen() );
			System.out.println("Blau "+ tmpC.getBlue() );
			System.out.println("-----------");
		}
		
	}
}
