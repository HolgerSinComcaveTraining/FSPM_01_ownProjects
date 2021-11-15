package schneckenrennen;

import java.util.ArrayList;

public class Wettbüro {

	private Rennen rennen;
	private ArrayList<Wette> wettenListe = new ArrayList<>();
	private double faktor = 3;

	/**
	 * @param rennen
	 * @param faktor
	 */
	public Wettbüro(Rennen rennen, double faktor) {
		this.rennen = rennen;
		this.faktor = faktor;
	}

	public double getFaktor() {
		return faktor;
	}

	public void setFaktor(double faktor) {
		this.faktor = faktor;
	}

	@Override
	public String toString() {
		String returnString = "";
		returnString = "Wettbüro [rennen=" + rennen + ", faktor=" + faktor  + System.lineSeparator();
		
		for (Wette wette : wettenListe) {
			returnString =  returnString + "\t" + wette + System.lineSeparator(); 
		}
				
		
		return returnString + "]" ;
	}

	public boolean wetteAnnehmen(String schneckenName, int wetteinsatz, String spieler) {
		Rennschnecke rennschnecke = rennen.getSchneckeByName(schneckenName);
		if (rennschnecke != null) {
			return wettenListe.add(new Wette(rennschnecke, wetteinsatz, spieler));

		} else {
			return false;
		}
	}

	public void rennenDurchfuehren() {
		rennen.durchfuehren();
		System.out.println(this);
		Rennschnecke gewinner = rennen.ermittleGewinner();
		for (Wette wette : wettenListe) {
			if (wette.getRennschnecke().equals(gewinner)) {
				System.out.println(gewinner.getName() +" hat gewonnen, " + wette.getSpieler() + " gewinnt " + wette.getWetteinsatz() * faktor);
			}
		}
		
	}

}
