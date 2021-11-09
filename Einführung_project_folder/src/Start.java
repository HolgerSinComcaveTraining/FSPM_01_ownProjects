
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		Stuhl stuhl1 = new Stuhl();
		Stuhl stuhl2 = new Stuhl();
		Stuhl stuhl3 = new Stuhl(5, "Plastik", true);
		Stuhl stuhl4 = new Stuhl(4);
		
		
		stuhl1.setAnzahlBeine(6);
		
		System.out.println(stuhl1);
		System.out.println(stuhl2);
		System.out.println(stuhl3);
		System.out.println(stuhl4);
		
		String alt = "Test";
		String a = "Alpha";
		String b = "Anna";
		alt.toUpperCase();
		System.out.println(a.compareTo(b));
	}

}
