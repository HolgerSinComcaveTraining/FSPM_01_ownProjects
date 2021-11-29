package pizza_2;

public interface IPizza {

	int getPrice(); // Preis in Cent

	boolean isVegetable(); // Pizza ist vegetarisch?

	boolean isHot(); // Pizza ist scharf?
	
	int getHotCounter();
}
