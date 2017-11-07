package nl.hu.pafr.opdr_2_2.dieren;

public abstract class Dier {
	protected int aantalPoten;
	
	public Dier() 	{ aantalPoten = 0; }	
	public Dier(int aP)	{ aantalPoten = aP; }
	
	public abstract String speak();
	
	public String toString() {
		return "Ik heb " + aantalPoten + " poten";
	}
}
