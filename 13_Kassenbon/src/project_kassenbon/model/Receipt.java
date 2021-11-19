package project_kassenbon.model;

import java.util.ArrayList;

public class Receipt {

	private String header = 
			"╔═════════════════════════╗" + System.lineSeparator() + 
			"║     FreitagsShop 042    ║" + System.lineSeparator() + 
			"║       Marchstr. 23      ║" + System.lineSeparator()+ 
			"║       10587 Berlin      ║" + System.lineSeparator() + 
			"║    ☏ 030 314 213 86     ║"+ System.lineSeparator() + 
			"╚═════════════════════════╝";

	private ArrayList<ReceiptItem> receiptItemList = new ArrayList<ReceiptItem>();
	
	private String verkaeufer = "Herr Max Mustermann";
	
	

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
		ReceiptItem newItem = ReceiptItem.createReceiptItem(name, anzahl);
		if (newItem != null) {
			return receiptItemList.add(newItem);
		} else {
			return false;
		}
	}

	public boolean addReceiptItem(int id, int anzahl) {
		ReceiptItem newItem = ReceiptItem.createReceiptItem(id, anzahl);
		if (newItem != null) {
			return receiptItemList.add(newItem);
		} else {
			return false;
		}
	}

}
