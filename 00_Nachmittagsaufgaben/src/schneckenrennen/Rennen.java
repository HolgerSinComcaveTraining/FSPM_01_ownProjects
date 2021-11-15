package schneckenrennen;

import java.util.ArrayList;

public class Rennen {

	private String name;
	private int schneckenCounter;
	private ArrayList<Rennschnecke> schneckenListe = new ArrayList<Rennschnecke>();
	private int trackLength;
	private int repeatCounter;
	
	public Rennen(String name, int trackLength) {
		this.name = name;
		this.trackLength = trackLength;
	}
	

	@Override
	public String toString() {
		String returnString = "";
		returnString = "Rennen [name=" + name + ", schneckenCounter=" + schneckenCounter + ", trackLength=" + trackLength + ", Durchläufe=" + repeatCounter + System.lineSeparator();
		
		for (Rennschnecke rennschnecke : schneckenListe) {
			returnString = returnString + "\t" + rennschnecke + System.lineSeparator(); 
		}
		return returnString + "]";
	}
	
	public Rennschnecke getSchneckeByName(String name) {
		for (Rennschnecke rennschnecke : schneckenListe) {
			if (rennschnecke.getName().equals(name)){
				return rennschnecke;
			}
		}
		return null;
	}


	public void addRennschnecke(Rennschnecke schnecke) {
		
		schneckenListe.add(schnecke);
		schneckenCounter = schneckenListe.size();
		
	}

	public void removeRennschnecke(String name) {
		Rennschnecke schnecke = getSchneckeByName(name); 
		if (schnecke != null)
		{
			
			schneckenListe.remove(schnecke);
			schneckenCounter = schneckenListe.size();
		}
		
		
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
		repeatCounter = 0;
		while (ermittleGewinner() == null) {
			lasseSchneckenKriechen();
			repeatCounter++;
		}
		System.out.println("Der Gewinner ist: " + ermittleGewinner());
		
	}
	
	
}
