package ausflug;

public class Hallenbad implements IAusflug {

	@Override
	public boolean istAusflugMoeglich(boolean wochentag, boolean gutesWetter, boolean schulferien, boolean tagsueber, boolean mitKindern) {
		// TODO Auto-generated method stub
		
		boolean istWE = ! wochentag;
		return !(schulferien && istWE);
	}

	@Override
	public String toString() {
		return "- Hallenbad \n";
	}
	
	

}
