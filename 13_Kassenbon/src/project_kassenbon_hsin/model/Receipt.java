package project_kassenbon_hsin.model;

import java.util.ArrayList;
import java.util.Collection;

import project_kassenbon.model.IBon;
import project_kassenbon.model.sortiment.ISortimentSpeicher;
import project_kassenbon.model.sortiment.Produkt;
import project_kassenbon.model.sortiment.Sortiment;
import project_kassenbon_hsin.model.sortiment.DefaultProducts;

public class Receipt implements IBon<ReceiptItem, String, String> {

	private String header = 
			"╔═════════════════════════╗" + System.lineSeparator() + 
			"║     FreitagsShop 042    ║" + System.lineSeparator() + 
			"║       Marchstr. 23      ║" + System.lineSeparator() + 
			"║       10587 Berlin      ║" + System.lineSeparator() + 
			"║   ☏ 030 314 213 86 ☏   ║" + System.lineSeparator() + 
			"╚═════════════════════════╝";

	private ArrayList<ReceiptItem> receiptItemList = new ArrayList<ReceiptItem>();
//	private Assortment assortment = new Assortment();
	private Sortiment sortiment = new Sortiment(new DefaultProducts());

	private String verkaeufer = "Herr Max Mustermann";

	public Receipt() {

	}

	public String getVerkaeufer() {
		return verkaeufer;
	}

	public void setVerkaeufer(String verkaeufer) {
		this.verkaeufer = verkaeufer;
	}

	public String getHeader() {
		return header;
	}

	public ArrayList<ReceiptItem> getReceiptItemList() {
		return receiptItemList;
	}

	public boolean addReceiptItem(ReceiptItem e) {
		return receiptItemList.add(e);
	}

	public boolean remove(Object o) {
		return receiptItemList.remove(o);
	}

	public Sortiment getSortiment() {
		return sortiment;
	}

	@Override
	public String toString() {
		double summe = 0;
		String returnString = "Receipt" + System.lineSeparator() + header + System.lineSeparator()
				+ System.lineSeparator();
		for (ReceiptItem receiptItem : receiptItemList) {
			returnString += receiptItem.toStringPrint();
			summe += receiptItem.getAnzahl() * receiptItem.getArtikel().getPreis();
		}
		returnString += System.lineSeparator();
		returnString += String.format("%26s%n", "=======");
		returnString += "Summe EUR " + String.format("%16.2f%n", summe);
		returnString += String.format("%26s%n", "=======");
		returnString += System.lineSeparator();
		returnString += "Es bediente Sie: \n" + verkaeufer;

		return returnString;
	}

	public boolean addReceiptItem(String name, int anzahl) {
		for (Produkt produkt : sortiment.getSortiment()) {
			if (produkt.getBezeichnung().equalsIgnoreCase(name)) {
				ReceiptItem newItem = new ReceiptItem(produkt, anzahl);
				return receiptItemList.add(newItem);
			}
		}
		return false;
	}

	public boolean addReceiptItem(int id, int anzahl) {

		for (Produkt produkt : sortiment.getSortiment()) {
			if (produkt.getId() == id) {
				ReceiptItem newItem = new ReceiptItem(produkt, anzahl);
				return receiptItemList.add(newItem);
			}
		}
		return false;

	}

	public void resetReceiptItemList() {
		receiptItemList = new ArrayList<ReceiptItem>();
	}

// Interface Methods

	@Override
	public void setLaden(String element) {
		header = element;

	}

	@Override
	public void addEintrag(ReceiptItem element) {
		addReceiptItem(element);

	}

	@Override
	public Collection<ReceiptItem> getEintraege() {
		return receiptItemList;
	}

	@Override
	public String verkaueferToString() {
		return verkaeufer;
	}

	@Override
	public String ladenToString() {
		return header;
	}

	@Override
	public String bonToString() {
		return toString();
	}

	@Override
	public void removeEintrag(ReceiptItem element) {
		remove(element);
	}

	@Override
	public void resetEintraege() {
		resetReceiptItemList();
	}
	
	
}