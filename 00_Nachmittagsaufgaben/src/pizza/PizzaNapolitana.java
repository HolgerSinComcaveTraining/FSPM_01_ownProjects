package pizza;

public class PizzaNapolitana implements IPizza {

	private double preis = 11;
	private String[] zutaten = {"Tomaten","Mozarella"};
	
	
	
	@Override
	public String[] getZutaten() {
		// TODO Auto-generated method stub
		return zutaten;
	}

	@Override
	public double getPreis() {
		// TODO Auto-generated method stub
		return preis;
	}

}
