package model;

public class Kunde {

	private String vorname;
	private String name;
	private String adresse;
	
	public Kunde(String vorname, String name, String adresse) {
		this.vorname = vorname;
		this.name = name;
		this.adresse = adresse;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	
	
	
}
