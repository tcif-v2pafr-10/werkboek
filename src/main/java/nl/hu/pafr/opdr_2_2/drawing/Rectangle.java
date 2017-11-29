package nl.hu.pafr.opdr_2_2.drawing;

class Rectangle extends Shape {
	private int width;
	private int height;

	// constructor
	Rectangle(int newx, int newy, int newwidth, int newheight) {
		super(newx, newy);
		setWidth(newwidth);
		setHeight(newheight);
	}

	// accessors for the width & height
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int newwidth) {
		width = newwidth;
	}

	public void setHeight(int newheight) {
		height = newheight;
	}

	// draw the rectangle
	public void draw() {
		System.out.println("Drawing a Rectangle at:(" + x + ", " + y + "), width " + getWidth() + ", height "
				+ getHeight());
	}

}
