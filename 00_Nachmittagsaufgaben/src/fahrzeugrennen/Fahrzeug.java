package fahrzeugrennen;

public class Fahrzeug {
	private double position = 0;
	private double speed = 0;
	private int maxSpeed = 0;
	private int wheels = 0;

	
	
	
	public Fahrzeug(int maxSpeed, int wheels) {
		this.maxSpeed = maxSpeed;
		this.wheels = wheels;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if (speed > maxSpeed) {
			speed = maxSpeed;
		}
		this.speed = speed;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getPosition() {
		return position;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}


	@Override
	public String toString() {
		String classString = this.getClass().toString();
		classString = classString.substring(classString.lastIndexOf('.')+1);
		return "Fahrzeug "+ classString  +" [position=" + position + ", speed=" + speed + ", maxSpeed=" + maxSpeed + ", wheels=" + wheels
				+ "]";
	}

	// Eigene Methoden
	
	public void bewege(double time) {
		if (time < 0) {
			time = 0;
		}
		position += speed * time / 60;
	}

}
