package pizza_2.toppings;

import pizza_2.IPizza;

public abstract class Topping implements IPizza {

	private int preis; // in cent
	private boolean vegetable; 
	private boolean hot;
	
	private IPizza below;
	
	
	
	/**
	 * @param preis
	 * @param vegetable
	 * @param hot
	 * @param below
	 */
	public Topping(int preis, boolean vegetable, boolean hot, IPizza below) {
		this.preis = preis;
		this.vegetable = vegetable;
		this.hot = hot;
		this.below = below;
	}

	
	
	public IPizza getBelow() {
		return below;
	}
	
	public String getPizzaInfo() {
		return this.toString() + String.format("%.2f€",(double) this.getPrice()/100);
	}

	public int getHotCounter() {
		return below.getHotCounter() +(hot ? 1 : 0);
	}


	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return below.getPrice() + preis;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return below.isVegetable() && vegetable;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return getHotCounter() >= 2 ? true : false;
	}

}
