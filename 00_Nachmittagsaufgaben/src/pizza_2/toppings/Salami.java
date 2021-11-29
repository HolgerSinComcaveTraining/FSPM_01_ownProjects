package pizza_2.toppings;

import pizza_2.IPizza;

public class Salami extends Topping {

	public Salami(IPizza below) {
		super(225, false, true, below);

	}

	@Override
	public String toString() {
		return super.getBelow() + ", mit Salami";
	}
	
	

}
