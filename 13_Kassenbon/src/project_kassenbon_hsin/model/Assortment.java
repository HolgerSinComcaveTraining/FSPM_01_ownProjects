package project_kassenbon_hsin.model;

import java.util.ArrayList;

public class Assortment {
	
	private ArrayList<Product> liste = new ArrayList<Product>();

	private int idCounter = 1;
	
	
	
	
	
	public ArrayList<Product> getListe() {
		return liste;
	}

	public int getIdCounter() {
		return idCounter;
	}
	
	

	@Override
	public String toString() {
		return "Artikelliste [artikelListe=" + liste + ", idCounter=" + idCounter + "]";
	}

	public boolean addProduct(String name, double preis) {
		if (getProductByName(name) != null) {
			return false;
		}
		Product newArtikel = new Product(idCounter, name, preis);
		idCounter++;
		return liste.add(newArtikel);
		
	}

	public Product getProductByName(String name) {
		for (Product product : liste) {
			if (product.getName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
	}
	
	public Product getProductByID(int id) {
		for (Product product : liste) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}
}
