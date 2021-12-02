package ausflug;

public class Brotbackkurs implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		boolean istWE = ! wochentag;
		boolean regenWetter = !gutesWetter;
		boolean schulzeit = ! schulferien;
		boolean istAbend = ! tagsueber;
		boolean nurErwachsene = !mitKindern;
		
		return istWE && regenWetter;
	}

	@Override
	public String toString() {
		return "- Brotbackkurs \n";
	}
	
	

}
