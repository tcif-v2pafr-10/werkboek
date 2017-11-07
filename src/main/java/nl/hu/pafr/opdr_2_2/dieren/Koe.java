package nl.hu.pafr.opdr_2_2.dieren;

public class Koe extends Dier {
	private double litersMelk;
	
	public Koe() { super(4); }
	
	public void setLitersMelk(double lt) {
		litersMelk = lt;
	}
	
	public String speak() {
		return "Boe!";
	}
	
	public String toString() {
		return "Ik ben een koe met " + litersMelk + " liters melk. "
 + super.toString();
	}
}
