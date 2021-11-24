package project_kassenbon_hsin.model.sortiment;

public class Produkt {
	private String bezeichnung;
	private double preis;
	private int id;
	
	
	/**
	 * @param bezeichnung
	 * @param preis
	 * @param id
	 */
	public Produkt(String bezeichnung, double preis, int id) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
		this.id = id;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}


	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}


	public double getPreis() {
		return preis;
	}


	public void setPreis(double preis) {
		this.preis = preis;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
}
