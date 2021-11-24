package project_kassenbon_hsin.model.sortiment;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortiment {

	private ISortimentSpeicher speicher;
	private ArrayList<Produkt> sortiment;
	
	/**
	 * @param speicher
	 * @param sortiment
	 */
	public Sortiment(ISortimentSpeicher speicher) {
		this.speicher = speicher;
		this.sortiment = (ArrayList<Produkt>) Arrays.asList(speicher.getSortiment()) ;
	}

	public ISortimentSpeicher getSpeicher() {
		return speicher;
	}

	public ArrayList<Produkt> getSortiment() {
		return sortiment;
	}
	
	
	
	
	
}
