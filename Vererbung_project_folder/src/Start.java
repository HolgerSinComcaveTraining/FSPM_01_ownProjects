
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tier tier1 = new Tier();
		Hund hund1 = new Hund();
		Katze katze1 = new Katze();
		
		hund1.setName("Waldi");
		
		System.out.println(tier1);
		System.out.println(hund1);
		System.out.println(katze1);
		katze1.miauen();
				
		
	}

}
