package nl.hu.pafr.opdr_2_2.drawing;

public class GraphicEditor {
	public static void main(String argv[]) {
		Circle c1 = new Circle();
		drawShape(c1);
	}

	public static void drawShape(Circle c) {
		c.draw();
	}
}
