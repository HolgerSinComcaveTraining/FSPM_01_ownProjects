package model;

import java.util.ArrayList;

public class Kundenspeicher {

	private ArrayList<Kunde> kundenListe;

	public Kundenspeicher() {
		this.kundenListe = new ArrayList<>();
	}

	public Kundenspeicher(ArrayList<Kunde> kundenListe) {
		this.kundenListe = kundenListe;
	}

	public ArrayList<Kunde> getKundenListe() {
		return kundenListe;
	}

	public void setKundenListe(ArrayList<Kunde> kundenListe) {
		this.kundenListe = kundenListe;
	}

	public boolean add(Kunde e) {
		return kundenListe.add(e);
	}

	public boolean remove(Object o) {
		return kundenListe.remove(o);
	}
	
	
}
