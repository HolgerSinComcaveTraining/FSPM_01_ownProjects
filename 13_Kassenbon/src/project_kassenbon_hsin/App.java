package project_kassenbon_hsin;

import java.io.File;
import java.util.ArrayList;

import project_kassenbon.model.Artikel;
import project_kassenbon.model.sortiment.Produkt;
import project_kassenbon_hsin.controller.HsinIBonController;
import project_kassenbon_hsin.controller.SchirmerIBonController;
import project_kassenbon_hsin.controller.SchirmerIBonController_V2;
import project_kassenbon_hsin.model.Receipt;
import project_kassenbon_hsin.model.ReceiptItem;
import project_kassenbon_hsin.model.sortiment.FileSaver;

public class App {

	public static void main(String[] args) {

		HsinIBonController hic = new HsinIBonController();
//		SchirmerIBonController sic = new SchirmerIBonController();
//		SchirmerIBonController_V2 sic2 = new SchirmerIBonController_V2();

		
//		FileSaver fs = new FileSaver();
//		fs.getSortiment();

//		ArrayList<Produkt> produktListe = new ArrayList<Produkt>();
//		int counter = 1;
//		
//
//		produktListe.add(new Produkt("15 Fischstäbchen", 1.79, counter++));
//		produktListe.add(new Produkt("Steaks", 3.99, counter++));
//		produktListe.add(new Produkt("Naturell (1l)", 4.99, counter++));
//		produktListe.add(new Produkt("Magnum Eiscreme", 2.99, counter++));
//		produktListe.add(new Produkt("Banane", 1.99, 123));
//		produktListe.add(new Produkt("Kaffee", 4.99, 456));
//		produktListe.add(new Produkt("Milch", 0.69, counter++));
//		for (int i = 1; i <= 10; i++) {
//			produktListe.add(new Produkt("Random Artikel " + i, 10.99 + i, counter++));
//		}
//
//		FileSaver fs = new FileSaver();
//		fs.sortimentSpeichern(produktListe.toArray(new Produkt[0]));
	}

}
