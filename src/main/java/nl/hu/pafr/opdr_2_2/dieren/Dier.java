package nl.hu.pafr.opdr_2_2.dieren;

public abstract class Dier {
	protected int aantalPoten;

	public Dier() {
		aantalPoten = 0;
	}

	public Dier(int aantalPoten) {
		this.aantalPoten = aantalPoten;
	}

	public String toString() {
		return "Ik heb " + aantalPoten + " poten";
	}
}
