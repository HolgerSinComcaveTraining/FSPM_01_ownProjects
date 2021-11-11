package vererbung_IV;

public class Hilfsarbeiter extends Mitarbeiter {

	private double stundenlohn;
	private double anzahlStunden;
	private double ueberstundenzuschlag;
	private double anzahlUberstunden;

	
		
	
	public Hilfsarbeiter(int personalNr, String name, String datumEintritt, double stundenlohn, double anzahlStunden,
			double ueberstundenzuschlag, double anzahlUberstunden) {
		super(personalNr, name, datumEintritt);
		this.stundenlohn = stundenlohn;
		this.anzahlStunden = anzahlStunden;
		this.ueberstundenzuschlag = ueberstundenzuschlag;
		this.anzahlUberstunden = anzahlUberstunden;
	}

	public double getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public double getAnzahlStunden() {
		return anzahlStunden;
	}

	public void setAnzahlStunden(double anzahlStunden) {
		this.anzahlStunden = anzahlStunden;
	}

	public double getUeberstundenzuschlag() {
		return ueberstundenzuschlag;
	}

	public void setUeberstundenzuschlag(double ueberstundenzuschlag) {
		this.ueberstundenzuschlag = ueberstundenzuschlag;
	}

	public double getAnzahlUberstunden() {
		return anzahlUberstunden;
	}

	public void setAnzahlUberstunden(double anzahlUberstunden) {
		this.anzahlUberstunden = anzahlUberstunden;
	}

		
	
	//------- eigene Methoden
	
	@Override
	public String toString() {
		return super.toString() + " ist Hilfsarbeiter";
	}

	@Override
	public double getMonatsLohn() {
		// TODO Auto-generated method stub
		return stundenlohn * anzahlStunden + ueberstundenzuschlag * anzahlUberstunden;
	}

}
