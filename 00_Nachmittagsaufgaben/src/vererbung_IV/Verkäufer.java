package vererbung_IV;

public class Verkäufer implements IMitarbeiterInterface {


	private int personalNr;
	private String name;
	private String datumEintritt;
	
	private double fixgehalt;
	private double umsatz;
	private double provision;
	
	
	
	
	public Verkäufer(int personalNr, String name, String datumEintritt, double fixgehalt, double umsatz,
			double provision) {
		
		this.personalNr = personalNr;
		this.name = name;
		this.datumEintritt = datumEintritt;
		this.fixgehalt = fixgehalt;
		this.umsatz = umsatz;
		this.provision = provision;
	}


	@Override
	public int getPersonalNr() {
		// TODO Auto-generated method stub
		return personalNr;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
	@Override
	public String toString() {
		return "Verkäufer [name=" + name + "]";
	}

	// eigene Methoden
	@Override
	public double getMonatsLohn() {
		// TODO Auto-generated method stub
		return fixgehalt + umsatz * provision/100;
	}

}
