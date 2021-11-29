package pizza_2.toppings;

import pizza_2.IPizza;

public class Chili extends Topping {

	public Chili(IPizza below) {
		super(95, true, true, below);

	}

	@Override
	public String toString() {
		return super.getBelow() + ", mit Chili";
	}
	
	

}
