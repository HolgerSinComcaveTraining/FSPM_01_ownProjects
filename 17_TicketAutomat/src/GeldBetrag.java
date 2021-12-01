
public class GeldBetrag {
	
	public static final GeldBetrag CENT_1 = new GeldBetrag(1);
	public static final GeldBetrag CENT_2 = new GeldBetrag(2);
	public static final GeldBetrag CENT_5 = new GeldBetrag(5);
	public static final GeldBetrag CENT_10 =new GeldBetrag(10);
	public static final GeldBetrag CENT_20 = new GeldBetrag(20);
	public static final GeldBetrag CENT_50 = new GeldBetrag(50);
	public static final GeldBetrag EURO_1 = new GeldBetrag(100);
	public static final GeldBetrag EURO_2 = new GeldBetrag(200);
	public static final GeldBetrag EURO_5 = new GeldBetrag(500);
	public static final GeldBetrag EURO_10 = new GeldBetrag(1000);
	public static final GeldBetrag EURO_20 = new GeldBetrag(2000);
	
//	CENT_1(1);
//	CENT_2(2);
//	CENT_5(5);
//	CENT_10(10);
//	CENT_20(20);
//	CENT_50(50);
//		
	private final int wert; // in cent

	/**
	 * @param preis
	 */
	private GeldBetrag(int wert) {
		this.wert = wert;
	}

	public int getWert() {
		return wert;
	}

	@Override
	public String toString() {
		return ((double) wert/100) + "€";
	}
	
	public static GeldBetrag[] getBetraege() {
		GeldBetrag[] returnArray = {CENT_1, CENT_2, CENT_5, CENT_10, CENT_20, CENT_50, EURO_1, EURO_2, EURO_5, EURO_10, EURO_20};
		return returnArray;
	}
		
	public static GeldBetrag[] getMuenzen() {
		GeldBetrag[] returnArray = {CENT_1, CENT_2, CENT_5, CENT_10, CENT_20, CENT_50, EURO_1, EURO_2};
		return returnArray;
	}
	
}
