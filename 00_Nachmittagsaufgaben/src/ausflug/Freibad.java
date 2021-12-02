package ausflug;

public class Freibad implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		return gutesWetter && tagsueber;
	}

	@Override
	public String toString() {
		return "- Freibad \n";
	}
	
	

}
