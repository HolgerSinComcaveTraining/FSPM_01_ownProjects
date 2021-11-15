package schneckenrennen;

public class App {

	public static void main(String[] args) {
		Rennschnecke rs1 = new Rennschnecke("Schnecki", "Rennschnecke", 3);
		Rennschnecke rs2 = new Rennschnecke("Schlumpfi", "Rennschnecke", 2.9);
		Rennschnecke rs3 = new Rennschnecke("Blitzi", "Rennschnecke", 3.5);
		Rennschnecke rs4 = new Rennschnecke("Schnelli", "Rennschnecke", 3.4);
		
		
		Rennen myRennen = new Rennen("Mein Rennen", 5);
		
		myRennen.addRennschnecke(rs1);
		myRennen.addRennschnecke(rs2);
		myRennen.addRennschnecke(rs3);
		myRennen.addRennschnecke(rs4);
		
//		myRennen.durchfuehren();
		
		Wettb�ro wettb�ro = new Wettb�ro(myRennen,5);
		
		wettb�ro.wetteAnnehmen("Schnecki", 10, "Player 1");
		wettb�ro.wetteAnnehmen("Schlumpfi", 20, "Player 2");
		wettb�ro.wetteAnnehmen("Blitzi", 30, "Player 3");
		wettb�ro.wetteAnnehmen("Schnelli", 40, "Player 4");
		
		wettb�ro.rennenDurchfuehren();
		
//		System.out.println(myRennen);
		
	}

}
