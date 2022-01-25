import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		
//		ZonenEnum selectedZone = (ZonenEnum) JOptionPane.showInputDialog(null, "Bitte Tarifzone auswählen", "Tarif Automat", JOptionPane.QUESTION_MESSAGE, null, ZonenEnum.values(), ZonenEnum.B);
		int returnIndexZone = JOptionPane.showOptionDialog(null, "Bitte Tarifzone auswählen", "Tarif Automat", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ZonenEnum.values(), ZonenEnum.K);
		ZonenEnum selectedZone = ZonenEnum.values()[returnIndexZone];
		System.out.println(selectedZone);
		int restBetrag = selectedZone.getPreis();
		while (restBetrag > 0) {
			int returnIndexGeld = JOptionPane.showOptionDialog(null, "Zu zahlender Betrag: " + String.format("%.2f€",(double) restBetrag/100), "Bitte Geld einwerfen", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, GeldBetrag.getBetraege(), null);
			restBetrag -= GeldBetrag.getBetraege()[returnIndexGeld].getWert();
				
		}
		if (restBetrag == 0) {
			JOptionPane.showMessageDialog(null, "Vielen Dank", "Betrag passend eingegeben", JOptionPane.INFORMATION_MESSAGE);
		} else {
			
			JOptionPane.showMessageDialog(null, "Rückgeld in Summe: " + String.format("%.2f€",(double) -restBetrag/100) + "\n" + wechselGeldBerechnen(Math.abs(restBetrag)) , "Wechselgeld", JOptionPane.INFORMATION_MESSAGE);
		}
		
		System.out.println(restBetrag);

	}

	private static String wechselGeldBerechnen(int restBetrag) {
		// TODO Auto-generated method stub
		ArrayList<GeldBetrag> wechselGeldListe = new ArrayList<>();
		
		while (restBetrag > 0) {
			GeldBetrag betrag = GeldBetrag.CENT_1;
			
			int highestAvailableGeldBetrag = 1;
			for (GeldBetrag tmpBetrag : GeldBetrag.getMuenzen()) {
				if (tmpBetrag.getWert() > highestAvailableGeldBetrag && tmpBetrag.getWert() <= restBetrag) {
					highestAvailableGeldBetrag = tmpBetrag.getWert();
					betrag = tmpBetrag;
				}
			}
			wechselGeldListe.add(betrag);
			restBetrag -= betrag.getWert();
		}
			
		return wechselGeldListe.toString();
	}

}
