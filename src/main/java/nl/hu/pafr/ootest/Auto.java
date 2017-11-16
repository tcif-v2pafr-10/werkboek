package nl.hu.pafr.ootest;

import java.util.Calendar;

public class Auto extends Voertuig {
	private String kenteken;

	
	public Auto(String type, double nieuwprijs, int bouwjaar, String kenteken) {
		super(type, nieuwprijs, bouwjaar);
		this.kenteken = kenteken;
	}

	@Override
	public double huidigeWaarde() {
		Calendar cal = Calendar.getInstance();
		int leeftijd = cal.get(Calendar.YEAR) - this.bouwjaar;
		return this.nieuwprijs * Math.pow(0.75, leeftijd);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((kenteken == null) ? 0 : kenteken.hashCode());
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
		Auto other = (Auto) obj;
		if (kenteken == null) {
			if (other.kenteken != null)
				return false;
		} else if (!kenteken.equals(other.kenteken))
			return false;
		return true;
	}
	

}
