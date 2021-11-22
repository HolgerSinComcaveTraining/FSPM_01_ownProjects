package project_kassenbon_hsin.model;

import java.util.ArrayList;

public class Artikelliste {
	
	private ArrayList<Artikel> liste = new ArrayList<Artikel>();

	private int idCounter = 1;
	
	
	
	
	
	public ArrayList<Artikel> getListe() {
		return liste;
	}

	public int getIdCounter() {
		return idCounter;
	}
	
	

	@Override
	public String toString() {
		return "Artikelliste [artikelListe=" + liste + ", idCounter=" + idCounter + "]";
	}

	public boolean addArtikel(String name, double preis) {
		if (getArtikelByName(name) != null) {
			return false;
		}
		Artikel newArtikel = new Artikel(idCounter, name, preis);
		idCounter++;
		return liste.add(newArtikel);
		
	}

	public Artikel getArtikelByName(String name) {
		for (Artikel artikel : liste) {
			if (artikel.getName().equalsIgnoreCase(name)) {
				return artikel;
			}
		}
		return null;
	}
	
	public Artikel getArtikelByID(int id) {
		for (Artikel artikel : liste) {
			if (artikel.getId() == id) {
				return artikel;
			}
		}
		return null;
	}
}
