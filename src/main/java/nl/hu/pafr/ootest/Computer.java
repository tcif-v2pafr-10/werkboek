package nl.hu.pafr.ootest;

import java.util.Calendar;

public class Computer implements Goed {
	private String type;
	private String macAdres;
	private double aanschafPrijs;
	private int productieJaar;

	@Override
	public double huidigeWaarde() {
		Calendar cal = Calendar.getInstance();
		int leeftijd = cal.get(Calendar.YEAR) - this.productieJaar;
		return this.aanschafPrijs * Math.pow(0.6, leeftijd);
	}

	public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
		this.type = type;
		this.macAdres = macAdres;
		this.aanschafPrijs = aanschafPrijs;
		this.productieJaar = productieJaar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(aanschafPrijs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((macAdres == null) ? 0 : macAdres.hashCode());
		result = prime * result + productieJaar;
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
		Computer other = (Computer) obj;
		if (Double.doubleToLongBits(aanschafPrijs) != Double.doubleToLongBits(other.aanschafPrijs))
			return false;
		if (macAdres == null) {
			if (other.macAdres != null)
				return false;
		} else if (!macAdres.equals(other.macAdres))
			return false;
		if (productieJaar != other.productieJaar)
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
		return "Computer [type=" + type + ", macAdres=" + macAdres + ", aanschafPrijs=" + aanschafPrijs
				+ ", productieJaar=" + productieJaar + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMacAdres() {
		return macAdres;
	}

	public void setMacAdres(String macAdres) {
		this.macAdres = macAdres;
	}

	public double getAanschafPrijs() {
		return aanschafPrijs;
	}

	public void setAanschafPrijs(double aanschafPrijs) {
		this.aanschafPrijs = aanschafPrijs;
	}

	public int getProductieJaar() {
		return productieJaar;
	}

	public void setProductieJaar(int productieJaar) {
		this.productieJaar = productieJaar;
	}


}
