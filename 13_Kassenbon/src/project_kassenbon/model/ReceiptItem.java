package project_kassenbon.model;

public class ReceiptItem {
	private Artikel artikel;
	private int anzahl;

	public ReceiptItem(Artikel artikel, int anzahl) {
		this.artikel = artikel;
		this.anzahl = anzahl;
	}
	

	public Artikel getArtikel() {
		return artikel;
	}

	public int getAnzahl() {
		return anzahl;
	}

	@Override
	public String toString() {
		return anzahl + " x " + artikel.getName();
	}
	
	public String toStringPrint() {
		String returnString = String.format("%-18s", artikel.getName())
				+ String.format("%8.2f%n", artikel.getPreis() * anzahl);
		returnString += String.format("%4d x", anzahl)
				+ String.format("%8.2f%n", artikel.getPreis());
		return returnString;
	}
	
	
		
	public static ReceiptItem createReceiptItem(String name, int anzahl) {
		if (Artikel.getArtikelByName(name) != null ) {
			return new ReceiptItem(Artikel.getArtikelByName(name), anzahl);
		} else {
			return null;
		}
		
	}
	
	public static ReceiptItem createReceiptItem(int id, int anzahl) {
		if (Artikel.getArtikelByID(id) != null ) {
			return new ReceiptItem(Artikel.getArtikelByID(id), anzahl);
		} else {
			return null;
		}
		
	}

}
