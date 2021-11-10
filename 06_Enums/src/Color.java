
public enum Color {
	Red(255,0,0), Green(0,255,0), Yellow(255,255,0), Black(0,0,0);
	
	private final int red;
	private final int green;
	private final int blue;
	
	Color (int r, int g, int b){
		red = r;
		green = g;
		blue = b;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

}
