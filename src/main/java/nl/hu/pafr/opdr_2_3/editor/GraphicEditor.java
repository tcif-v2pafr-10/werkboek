package nl.hu.pafr.opdr_2_3.editor;

class GraphicEditor {
	public static void main(String argv[]) {
		Circle c1 = new Circle();
		drawShape(c1);
	}

	public void drawShape(Circle c) {
		c.draw();
	}
}
