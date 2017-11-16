package nl.hu.pafr.ootest;

public abstract class Voertuig implements Goed {
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	public Voertuig(String type, double nieuwprijs, int bouwjaar) {
		this.type = type;
		this.nieuwprijs = nieuwprijs;
		this.bouwjaar = bouwjaar;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bouwjaar;
		long temp;
		temp = Double.doubleToLongBits(nieuwprijs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voertuig other = (Voertuig) obj;
		if (bouwjaar != other.bouwjaar)
			return false;
		if (Double.doubleToLongBits(nieuwprijs) != Double.doubleToLongBits(other.nieuwprijs))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Voertuig [type=" + type + ", nieuwprijs=" + nieuwprijs + ", bouwjaar=" + bouwjaar + "]";
	}
	
	
}
