package schneckenrennen;

import java.util.ArrayList;

public class Rennen {

	private String name;
	private int schneckenCounter;
	private ArrayList<Rennschnecke> schneckenListe = new ArrayList<Rennschnecke>();
	private int trackLength;
	
	public Rennen(String name, int trackLength) {
		this.name = name;
		this.trackLength = trackLength;
	}

	public boolean addRennschnecke(Rennschnecke schnecke) {
		
		return schneckenListe.add(schnecke);
		
	}

	public boolean removeRennschnecke(String name) {
		for (Rennschnecke rennschnecke : schneckenListe) {
			if (rennschnecke.getName().equals(name)){
				return schneckenListe.remove(rennschnecke);
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		String returnString = "";
		returnString = "Rennen [name=" + name + ", schneckenCounter=" + schneckenCounter + ", trackLength=" + trackLength + "]" + System.lineSeparator();
		
		for (Rennschnecke rennschnecke : schneckenListe) {
			returnString = returnString + rennschnecke + System.lineSeparator(); 
		}
		return returnString;
	}

	public Rennschnecke ermittleGewinner() {
		double maxPosition = 0;
		Rennschnecke leader = null;
		for (Rennschnecke rennschnecke : schneckenListe) {
			if (rennschnecke.getPosition() > maxPosition) {
				maxPosition = rennschnecke.getPosition();
				leader = rennschnecke;
			}
		}
		if (maxPosition > trackLength) {
			return leader;
		}
		return null;
	}
	
	
	public void lasseSchneckenKriechen() {
		for (Rennschnecke rennschnecke : schneckenListe) {
			rennschnecke.krieche();
		}
	}
	
	public void durchfuehren() {
		while (ermittleGewinner() == null) {
			lasseSchneckenKriechen();
		}
		System.out.println("Der Gewinner ist: " + ermittleGewinner());
		
	}
	
	
}
