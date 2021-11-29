package pizza_2.toppings;

import pizza_2.IPizza;

public class Ham extends Topping {

	public Ham(IPizza below) {
		super(245, false, false, below);

	}

	@Override
	public String toString() {
		return super.getBelow() + ", mit Schinken";
	}
	
	

}
