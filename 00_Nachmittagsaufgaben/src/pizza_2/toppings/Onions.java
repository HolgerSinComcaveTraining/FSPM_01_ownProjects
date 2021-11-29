package pizza_2.toppings;

import pizza_2.IPizza;

public class Onions extends Topping {

	public Onions(IPizza below) {
		super(65, true, false, below);

	}

	@Override
	public String toString() {
		return super.getBelow() + ", mit Zwiebeln";
	}
	
	

}
