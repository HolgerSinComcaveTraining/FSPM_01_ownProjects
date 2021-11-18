package project_kassenbon;

import java.util.ArrayList;

import project_kassenbon.model.Artikel;
import project_kassenbon.model.Receipt;
import project_kassenbon.model.ReceiptItem;

public class App {

	public static void main(String[] args) {
		

		
		
//		ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();
		
//		artikelListe.add(Artikel.createArtikel("15 Fischstäbchen", 1.79));
		Artikel.addArtikel("15 Fischstäbchen", 1.79);
		Artikel.addArtikel("Steaks", 3.99);
		Artikel.addArtikel("Naturell (1l)", 4.99);
		Artikel.addArtikel("Magnum Eiscreme", 2.99);
		
//		System.out.println(Artikel.getArtikelListe());
		
		for (Artikel artikel : Artikel.getArtikelListe()) {
			System.out.println(artikel);
		}
		
		
//		ArrayList<ReceiptItem> receiptItemList = new ArrayList<ReceiptItem>();
//		receiptItemList.add(ReceiptItem.createReceiptItem("15 Fischstäbchen", 3));
//		receiptItemList.add(ReceiptItem.createReceiptItem("Steaks", 5));
//		receiptItemList.add(ReceiptItem.createReceiptItem(3, 6));
//		receiptItemList.add(ReceiptItem.createReceiptItem(4, 2));
//		
		Receipt receipt = new Receipt();
		receipt.addReceiptItem(1, 3);
		receipt.addReceiptItem(2, 5);
		receipt.addReceiptItem(3, 6);
		receipt.addReceiptItem(4, 2);
		
		
		
//		System.out.println(receiptItemList);
		
		System.out.println("-------------");
		
		System.out.println(receipt);
		
//		for (ReceiptItem receiptItem : receiptItemList) {
//			System.out.println(receiptItem);
//		}
		

		
	}

}
