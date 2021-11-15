package schneckenrennen;

public class Wette {
	
	private Rennschnecke rennschnecke;
	private int wetteinsatz;
	private String spieler;
	
	/**
	 * @param rennschnecke
	 * @param wetteinsatz
	 * @param spieler
	 */
	public Wette(Rennschnecke rennschnecke, int wetteinsatz, String spieler) {
		this.rennschnecke = rennschnecke;
		this.wetteinsatz = wetteinsatz;
		this.spieler = spieler;
	}

	
	
	public Rennschnecke getRennschnecke() {
		return rennschnecke;
	}



	public int getWetteinsatz() {
		return wetteinsatz;
	}



	public String getSpieler() {
		return spieler;
	}



	@Override
	public String toString() {
		return "Wette [rennschnecke=" + rennschnecke + ", wetteinsatz=" + wetteinsatz + ", spieler=" + spieler + "]";
	}
	
	

}
