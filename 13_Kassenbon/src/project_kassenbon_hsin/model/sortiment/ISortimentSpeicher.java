package project_kassenbon_hsin.model.sortiment;

public interface ISortimentSpeicher {
	public Produkt[] getSortiment();
	public void sortimentSpeichern(Produkt[] sortiment);
	public void produktHinzufuegen(Produkt produkt);
	public void produktAktualisieren(Produkt produkt);
	public void produktEntfernen(Produkt produkt);
	
}
