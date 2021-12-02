package ausflug;

public class OpenAirKino implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		boolean wochenende = ! wochentag;
		boolean regenWetter = !gutesWetter;
		boolean schulzeit = ! schulferien;
		boolean abends = ! tagsueber;
		boolean nurErwachsene = !mitKindern;
		
		return gutesWetter && (abends || wochenende);
	}

	@Override
	public String toString() {
		return "- Open-Air Kino \n";
	}
	
	

}
