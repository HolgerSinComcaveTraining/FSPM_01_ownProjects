package ausflug;

public class BesuchWasserfall implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		boolean wochenende = ! wochentag;
		boolean regenWetter = !gutesWetter;
		boolean schulzeit = ! schulferien;
		boolean abends = ! tagsueber;
		boolean nurErwachsene = !mitKindern;
		
		return tagsueber;
	}

	@Override
	public String toString() {
		return "- Besuch des Wasserfalls \n";
	}
	
	

}
