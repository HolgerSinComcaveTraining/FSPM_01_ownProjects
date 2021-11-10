package fahrzeugrennen;

public class Wettrennen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fahrzeug fahrrad = new Fahrrad();
		Fahrzeug auto = new Auto();
		Fahrzeug rennwagen = new Rennwagen();
		Fahrzeug krankenwagen = new Krankenwagen();
		
		fahrrad.setSpeed(20);
		auto.setSpeed(150);
		rennwagen.setSpeed(200);
		krankenwagen.setSpeed(80);
		
		fahrrad.bewege(300);
		auto.bewege(60);
		rennwagen.bewege(60);
		krankenwagen.bewege(60);
		
		System.out.println(fahrrad);
		System.out.println(auto);
		System.out.println(rennwagen);
		System.out.println(krankenwagen);
	}

}
