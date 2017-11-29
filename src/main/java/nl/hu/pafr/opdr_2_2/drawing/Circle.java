package nl.hu.pafr.opdr_2_2.drawing;

public class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public Circle() {
		super(0, 0);
	}

	@Override
	public void draw() {
		System.out.println("Drawing a Circle at:(" + x + ", " + y + "), radius " + radius);
	}

}
