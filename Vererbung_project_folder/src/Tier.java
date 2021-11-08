
public class Tier {

	private String name;
	private int alter;
	private double gewicht;
	
	
	/**
	 * @param name
	 * @param alter
	 * @param gewicht
	 */
	public Tier(String name, int alter, double gewicht) {
		this.name = name;
		this.alter = alter;
		this.gewicht = gewicht;
	}
	
	public Tier() {
		this("Testname", 5, 10.7);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return "Tier [name=" + name + ", alter=" + alter + ", gewicht=" + gewicht + "]";
	}
	
	
	
}
