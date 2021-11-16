package pizza;

public class PizzaMargherita implements IPizza {

	private double preis = 10;
	private String[] zutaten = {"Tomaten","Mozarella"};
	private String groesse;
	
	
	
	public PizzaMargherita(String groesse) {
		this.groesse = groesse;
	}

	@Override
	public String[] getZutaten() {
		// TODO Auto-generated method stub
		return zutaten;
	}

	@Override
	public double getPreis() {
		// TODO Auto-generated method stub
		switch (groesse) {
		case "mittel":
			return preis;
			
		case "klein":
			return preis*0.8;
		
		case "gross":
			return preis*1.5;
		
		default:
			return preis;
		}
	}

	public String getGroesse() {
		return groesse;
	}

	
}
