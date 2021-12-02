package ausflug;

public class Rennautofahren implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		boolean wochenende = ! wochentag;
		boolean regenWetter = !gutesWetter;
		boolean schulzeit = ! schulferien;
		boolean abends = ! tagsueber;
		boolean nurErwachsene = !mitKindern;
		
		return nurErwachsene && tagsueber && wochenende && schulferien;
	}

	@Override
	public String toString() {
		return "- Rennautofahren \n";
	}
	
	

}
