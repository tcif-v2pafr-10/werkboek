package nl.hu.pafr.opdr_2_2.drawing;

public abstract class Shape {
	protected int x;
	protected int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void draw();

	public void rMoveTo(int i, int j) {
		this.x = this.x + i;
		this.y = this.y + j;
	}

}
