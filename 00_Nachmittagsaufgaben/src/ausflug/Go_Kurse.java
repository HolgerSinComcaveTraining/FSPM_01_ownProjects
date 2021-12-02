package ausflug;

public class Go_Kurse implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		
		boolean wochenende = ! wochentag;
		boolean regenWetter = !gutesWetter;
		boolean schulzeit = ! schulferien;
		boolean abends = ! tagsueber;
		boolean nurErwachsene = !mitKindern;
		
		return (wochenende && regenWetter) || (wochentag && abends && gutesWetter);
	}

	@Override
	public String toString() {
		return "- Go-Kurse \n";
	}
	
	

}
