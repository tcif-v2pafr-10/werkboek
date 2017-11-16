package nl.hu.pafr.ootest;

import java.util.Calendar;

public class Fiets extends Voertuig {
	private int framenummer;
	

	public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
		super(type, nieuwprijs, bouwjaar);
		this.framenummer = framenummer;
	}


	@Override
	public double huidigeWaarde() {
		Calendar cal = Calendar.getInstance();
		int leeftijd = cal.get(Calendar.YEAR) - this.bouwjaar;
		return this.nieuwprijs * Math.pow(0.85, leeftijd);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + framenummer;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fiets other = (Fiets) obj;
		if (framenummer != other.framenummer)
			return false;
		return true;
	}

}
