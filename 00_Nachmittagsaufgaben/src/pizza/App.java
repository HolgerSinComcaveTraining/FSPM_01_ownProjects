package pizza;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPizza pizza1 = new PizzaNapolitana();
		IPizza pizza2 = new PizzaMargherita("gross");
		double gesamtPreis = 0;
		
		IPizza[] pizzenArray = {pizza1, pizza2};
		
		for (IPizza iPizza : pizzenArray) {
			gesamtPreis += iPizza.getPreis();
		}
		
		System.out.println("Der GesamtPreis ist " + gesamtPreis);
		
	}

}
