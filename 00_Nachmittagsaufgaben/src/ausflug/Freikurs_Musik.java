package ausflug;

public class Freikurs_Musik implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		boolean istWE = ! wochentag;
		boolean regenWetter = !gutesWetter;
		boolean schulzeit = ! schulferien;
		boolean istAbend = ! tagsueber;
		boolean nurErwachsene = !mitKindern;
		
		return istAbend && schulzeit && wochentag;
	}

	@Override
	public String toString() {
		return "- Freikurs Musik \n";
	}
	
	

}
