package ausflug;

public class Kegeln implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		// TODO Auto-generated method stub
		boolean istAbend = ! tagsueber;
		boolean istWE = ! wochentag;
		return istAbend || istWE;
	}

	@Override
	public String toString() {
		return "- Kegeln \n";
	}
	
	

}
