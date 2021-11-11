package vererbung_IV;

public abstract class Mitarbeiter {

	private int personalNr;
	private String name;
	private String datumEintritt;
	
	
	
	
	
	public Mitarbeiter(int personalNr, String name, String datumEintritt) {
		super();
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
	}
	
	
	public int getPersonalNr() {
		return personalNr;
	}
	public String getName() {
		return name;
	}
	public String getDatumEintritt() {
		return datumEintritt;
	}
	
	

	@Override
	public String toString() {
		return "Mitarbeiter [name=" + name + "]";
	}
	
	
	//--------------  Eigene Methoden
	


	public abstract double getMonatsLohn();
	
	
}
