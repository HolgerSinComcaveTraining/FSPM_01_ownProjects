package ausflug;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
	private static ArrayList<IAusflug> ausfluege = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean wochentag;
		boolean gutesWetter;
		boolean schulferien;
		boolean tagsueber;
		boolean mitKindern;
		
		ausfluege.add(new Kegeln());
		ausfluege.add(new Freibad());
		ausfluege.add(new Hallenbad());
		ausfluege.add(new Wandern());
		ausfluege.add(new Freikurs_Musik());
		ausfluege.add(new Brotbackkurs());
		ausfluege.add(new Schieferbergwerk());
		ausfluege.add(new Go_Kurse());
		ausfluege.add(new Billard());
		ausfluege.add(new Rennautofahren());
		ausfluege.add(new OpenAirKino());
		ausfluege.add(new Korbflechten());
		ausfluege.add(new BesuchWasserfall());
		ausfluege.add(new Zoobesuch());
		
		String[] options = {"Wochentag", "Wochenende"};
		int returnvalue = JOptionPane.showOptionDialog(null, "Bitte auswählen", "Ausflugsbedingungen: Wochentag", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		wochentag = returnvalue == 0 ? true : false; 
		options = new String[] {"Schönes Wetter", "Regenwetter"};
		returnvalue = JOptionPane.showOptionDialog(null, "Bitte auswählen", "Ausflugsbedingungen: Wochentag", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		gutesWetter = returnvalue == 0 ? true : false;
		options = new String[] {"Schulferien", "Schule"};
		returnvalue = JOptionPane.showOptionDialog(null, "Bitte auswählen", "Ausflugsbedingungen: Wochentag", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		schulferien = returnvalue == 0 ? true : false;
		options = new String[] {"Tagsüber", "Abends"};
		returnvalue = JOptionPane.showOptionDialog(null, "Bitte auswählen", "Ausflugsbedingungen: Wochentag", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		tagsueber = returnvalue == 0 ? true : false;
		options = new String[] {"Mit Kindern", "Ohne Kinder"};
		returnvalue = JOptionPane.showOptionDialog(null, "Bitte auswählen", "Ausflugsbedingungen: Wochentag", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
		mitKindern = returnvalue == 0 ? true : false;
		System.out.println("wochentag " + wochentag +
				"\ngutesWetter " + gutesWetter +
				"\nschulferien " + schulferien +
				"\ntagsueber " + tagsueber +
				"\nmitKindern " + mitKindern + "\n" + 
				verfuegbareAusfluege(wochentag, gutesWetter, schulferien, tagsueber, mitKindern));
		JOptionPane.showMessageDialog(null, verfuegbareAusfluege(wochentag, gutesWetter, schulferien, tagsueber, mitKindern));
		
		
	}
	
	public static String verfuegbareAusfluege(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		String resultString = "Verfügbare Ausflüge: \n";
		for (IAusflug iAusflug : ausfluege) {
			if (iAusflug.istAusflugMoeglich(wochentag, gutesWetter, schulferien, tagsueber, mitKindern)) {
				resultString += iAusflug.toString();
			}
		}
		
		return resultString;
	}

}
