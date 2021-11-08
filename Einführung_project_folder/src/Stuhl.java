
public class Stuhl {

	private int anzahlBeine;
	private String material;
	private boolean gepolstert;
	
	
	public Stuhl() {
		this.anzahlBeine = 4;
		this.material = "Fichte";
		this.gepolstert = false;
	}
	
	
	public Stuhl(int anzahlBeine, String material, boolean gepolstert) {
		
		this.anzahlBeine = anzahlBeine;
		this.material = material;
		this.gepolstert = gepolstert;
	}
	
	/**
	 * Erzeugt neuen Stuhl mit als Prameter 
	 * @param anzahlBeine
	 */
	public Stuhl(int anzahlBeine) {
		this(anzahlBeine, "Eisen", false);
	}

	/**
	 * Gibt anzahl Beine zurück
	 * @return anzahlBeine
	 */
	public int getAnzahlBeine() {
		return anzahlBeine;
	}


	public void setAnzahlBeine(int anzahlBeine) {
		if (anzahlBeine < 3) {
			this.anzahlBeine = 3;
		} else {
			this.anzahlBeine = anzahlBeine;
		}
		
	}


	@Override
	public String toString() {
		return "Stuhl [anzahlBeine=" + anzahlBeine + ", material=" + material + ", gepolstert=" + gepolstert
				+ ", getAnzahlBeine()=" + getAnzahlBeine() + "]";
	}
	
	
	
	
	
}
