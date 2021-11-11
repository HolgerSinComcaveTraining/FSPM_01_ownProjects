package fahrzeugrennen;

public class Auto extends Fahrzeug {

	public Auto() {
		this(140);
		
	}

	public Auto(int maxSpeed) {
		super(maxSpeed, 4);
		
	}
}
