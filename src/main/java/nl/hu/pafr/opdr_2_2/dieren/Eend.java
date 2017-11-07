package nl.hu.pafr.opdr_2_2.dieren;

public class Eend extends Dier {
	private boolean kanVliegen;
	
	public Eend() {
		super(2);
		kanVliegen = true;
	}
	
	public void setKanVliegen(boolean b) {
		kanVliegen = b;
	}
	
	public String speak() {
		return "Kwek!";
	}
	
	public String toString() {
		return "Ik ben een eend en ik kan " + (kanVliegen ? "wel" : "niet") + " vliegen. "+ super.toString();
	}
}
