
public enum ZonenEnum {
	K(140),
	A(230),
	B(470),
	C(960),
	D(1140);
	
	private final int preis;

	/**
	 * @param preis
	 */
	private ZonenEnum(int preis) {
		this.preis = preis;
	}

	public int getPreis() {
		return preis;
	}
	
	
	
}
