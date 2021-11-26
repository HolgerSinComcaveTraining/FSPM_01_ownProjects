package project_kassenbon_hsin.model.sortiment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import project_kassenbon.model.sortiment.ISortimentSpeicher;
import project_kassenbon.model.sortiment.Produkt;

//import project_kassenbon.model.Artikel;
//import project_kassenbon_hsin.model.sortiment.ISortimentSpeicher;
//import project_kassenbon_hsin.model.sortiment.Produkt;

public class FileSaver implements ISortimentSpeicher {

//	private ArrayList<Produkt> produktListe = new ArrayList<Produkt>();
//	private HashSet<Produkt> produktSet = new HashSet<Produkt>();
	private File file = new File("..\\FileSaverStandardFile.csv");

	/**
	 * 
	 */
	public FileSaver() {
//		produktListe.add(new Produkt("15 Fischstäbchen", 1.79, getNextID()));
//		produktListe.add(new Produkt("Steaks", 3.99, getNextID()));
//		produktListe.add(new Produkt("Naturell (1l)", 4.99, getNextID()));
//		produktListe.add(new Produkt("Magnum Eiscreme", 2.99, getNextID()));
//		produktListe.add(new Produkt("Banane", 1.99, 123));
//		produktListe.add(new Produkt("Kaffee", 4.99, 456));
//		produktListe.add(new Produkt("Milch", 0.69, getNextID()));
//		for (int i = 1; i <= 10; i++) {
//			produktListe.add(new Produkt("Random Artikel " + i, 10.99 + i, getNextID()));
//		}
	}

	public int getNextID() {
		int counter = 1;
		Produkt produkt;
		ArrayList<Produkt> tmpProduktList = new ArrayList<Produkt>(Arrays.asList(getSortiment()));
		Iterator<Produkt> produktIterator = tmpProduktList.iterator();
		
		
		while (produktIterator.hasNext()) {
			produkt = (Produkt) produktIterator.next();
			if (produkt.getId() == counter) {
				counter++;
				produktIterator = tmpProduktList.iterator();
			}
		}
		return counter;

	}

	// Interface Methoden

	@Override
	public Produkt[] getSortiment() {
//		return produktListe.toArray(new Produkt[0]);
		ArrayList<Produkt> tmpProduktList = new ArrayList<Produkt>();
		String[] produktAsStringArray;
		try {
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNext()) {
				produktAsStringArray = fileScanner.nextLine().split(",");
				tmpProduktList.add(new Produkt(produktAsStringArray[1], Double.parseDouble(produktAsStringArray[2]), Integer.parseInt(produktAsStringArray[0])));
			}

			fileScanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tmpProduktList.toArray(new Produkt[0]);
	}

	@Override
	public void sortimentSpeichern(Produkt[] produktArray) {
//		produktListe = (ArrayList<Produkt>) Arrays.asList(sortiment);
//		System.out.println(file);
		try {
			FileWriter fw = new FileWriter(file, false);
			for (Produkt produkt : produktArray) {
				fw.write(produkt.getId() + "," + produkt.getBezeichnung() + "," + produkt.getPreis()
						+ System.lineSeparator());
//				System.out.println(produkt);
			}
			fw.close();
		} catch (IOException e) {
			System.out.println("catched exception while writing file:");
			e.printStackTrace();
		}
	}

	@Override
	public void produktHinzufuegen(Produkt produkt) {
		ArrayList<Produkt> tmpProduktList = new ArrayList<Produkt>(Arrays.asList(getSortiment()));
		tmpProduktList.add(produkt);
		sortimentSpeichern(tmpProduktList.toArray(new Produkt[0]));

	}

	@Override
	public void produktAktualisieren(Produkt produktParam) {
		ArrayList<Produkt> tmpProduktList = new ArrayList<Produkt>(Arrays.asList(getSortiment()));
		int index = -1;
		for (Produkt produkt : tmpProduktList) {
			if (produkt.getId() == produktParam.getId()) {
				index = tmpProduktList.indexOf(produkt);
				tmpProduktList.remove(produkt);
				tmpProduktList.add(index, produktParam);
			}
		}
		sortimentSpeichern(tmpProduktList.toArray(new Produkt[0]));

	}

	@Override
	public void produktEntfernen(Produkt produkt) {
		ArrayList<Produkt> tmpProduktList = new ArrayList<Produkt>(Arrays.asList(getSortiment()));
		tmpProduktList.remove(produkt);
		sortimentSpeichern(tmpProduktList.toArray(new Produkt[0]));
	}

	@Override
	public int getLastId() {
		ArrayList<Produkt> tmpProduktList = new ArrayList<Produkt>(Arrays.asList(getSortiment()));
		int lastId = 0;
		for (Produkt produkt : tmpProduktList) {
			if (lastId < produkt.getId()) {
				lastId = produkt.getId();
			}
		}
		return lastId + 1;
	}

}
