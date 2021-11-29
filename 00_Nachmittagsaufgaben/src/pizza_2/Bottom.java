package pizza_2;

public abstract class Bottom implements IPizza {

	private int preis; // in cent
	private boolean vegetable = true; 
	private boolean hot= false;
	
	
	
	/**
	 * @param preis
	 */
	public Bottom(int preis) {
		this.preis = preis;
	}
	
	
	public int getHotCounter() {
		return 0;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return preis;
	}

	@Override
	public boolean isVegetable() {
		
		return vegetable;
	}

	@Override
	public boolean isHot() {
		
		return hot;
	}

}
