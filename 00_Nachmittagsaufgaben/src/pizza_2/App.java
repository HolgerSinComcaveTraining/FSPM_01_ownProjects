package pizza_2;

import pizza_2.toppings.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPizza mypizza = new Crusty_Bottom();
		IPizza mypizza2 = new Onions(mypizza);
		IPizza mypizza3 = new Ham(mypizza2);
		IPizza mypizza4 = new Salami(mypizza3);
		IPizza mypizza5 = new Chili(mypizza4);
		IPizza mypizza6 = new Cheese(mypizza5);
		
		
		
		IPizza finalPizza = mypizza;
		System.out.println(finalPizza + " kostet " + String.format("%.2f€",(double) finalPizza.getPrice()/100) 
			+ " und ist" + (finalPizza.isVegetable() ? " " : " nicht ") + "vegetarisch"
			+ " und" + (finalPizza.isHot() ? " " : " nicht ") + "scharf");
		
	}

}
