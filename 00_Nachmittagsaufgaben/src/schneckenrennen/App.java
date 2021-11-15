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
		
		Wettbüro wettbüro = new Wettbüro(myRennen,5);
		
		wettbüro.wetteAnnehmen("Schnecki", 10, "Player 1");
		wettbüro.wetteAnnehmen("Schlumpfi", 20, "Player 2");
		wettbüro.wetteAnnehmen("Blitzi", 30, "Player 3");
		wettbüro.wetteAnnehmen("Schnelli", 40, "Player 4");
		
		wettbüro.rennenDurchfuehren();
		
//		System.out.println(myRennen);
		
	}

}
