package schneckenrennen;

import java.util.Random;

public class Rennschnecke {

	private String name;
	private String race;
	private double maxSpeed;
	private double position;
	
	public Rennschnecke(String name, String race, double maxSpeed) {
		this.name = name;
		this.race = race;
		this.maxSpeed = maxSpeed;
		this.position = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Rennschnecke [name=" + name + ", race=" + race + ", maxSpeed=" + maxSpeed + ", position=" + position
				+ "]";
	}
	
	
	public void krieche() {
		position += Math.random() * maxSpeed;
		
	}
	
	
}
