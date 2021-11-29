package pizza_2.toppings;

import pizza_2.IPizza;

public class Cheese extends Topping {

	public Cheese(IPizza below) {
		super(195, true, false, below);

	}

	@Override
	public String toString() {
		return super.getBelow() + ", mit Käse";
	}
	
	

}
