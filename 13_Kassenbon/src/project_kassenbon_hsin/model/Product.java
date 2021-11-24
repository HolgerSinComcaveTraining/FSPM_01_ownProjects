package project_kassenbon_hsin.model;

import java.util.ArrayList;

public class Product {

	private String name;
	private double preis;
	private int id;

	private static int idCounter = 1;
//	private static ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();

	public Product(int id, String name, double preis) {
		this.id = id;
		this.name = name;
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public int getId() {
		return id;
	}

	
	
//	public static ArrayList<Artikel> getArtikelListe() {
//		return artikelListe;
//	}

	@Override
	public String toString() {
		return String.format("%-2d#: ", id) + name;
	}
	
//	public String toStringInclID() {
//		return String.format("%-2d#:   ", id) + name;
//	}

	// eigene Methoden
//	public static boolean addArtikel(String name, double preis) {
//		if (Artikel.getArtikelByName(name) != null) {
//			return false;
//		}
//		Artikel newArtikel = new Artikel(idCounter, name, preis);
//		idCounter++;
//		return artikelListe.add(newArtikel);
//		
//	}
//
//	public static Artikel getArtikelByName(String name) {
//		for (Artikel artikel : artikelListe) {
//			if (artikel.getName().equalsIgnoreCase(name)) {
//				return artikel;
//			}
//		}
//		return null;
//	}
//	
//	public static Artikel getArtikelByID(int id) {
//		for (Artikel artikel : artikelListe) {
//			if (artikel.getId() == id) {
//				return artikel;
//			}
//		}
//		return null;
//	}
}