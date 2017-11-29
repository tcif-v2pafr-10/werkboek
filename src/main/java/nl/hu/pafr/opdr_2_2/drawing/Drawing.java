package nl.hu.pafr.opdr_2_2.drawing;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
	public static void main(String argv[]) {

		// create some shape instances
		List<Shape> scribble = new ArrayList<>();
		scribble.add(new Rectangle(10, 20, 5, 6));
		scribble.add(new Circle(15, 25, 8));

		// iterate through the list and handle shapes polymorphically
		for (Shape shape : scribble) {
			shape.draw();
			shape.rMoveTo(100, 100);
			shape.draw();
		}

		// call a rectangle specific function
		Rectangle arect = new Rectangle(0, 0, 15, 15);
		arect.setWidth(30);
		arect.draw();
	}
}
