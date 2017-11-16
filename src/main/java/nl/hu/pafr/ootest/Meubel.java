package nl.hu.pafr.ootest;

import java.util.Calendar;

public class Meubel implements Goed {
	private String type;
	private double aanschafPrijs;
	private int productieJaar;

	@Override
	public String toString() {
		return "Meubel [type=" + type + ", aanschafPrijs=" + aanschafPrijs + ", productieJaar=" + productieJaar + "]";
	}

	public Meubel(String type, double aanschafPrijs, int productieJaar) {
		super();
		this.type = type;
		this.aanschafPrijs = aanschafPrijs;
		this.productieJaar = productieJaar;
	}

	@Override
	public double huidigeWaarde() {
		Calendar cal = Calendar.getInstance();
		int leeftijd = cal.get(Calendar.YEAR) - this.productieJaar;
		return this.aanschafPrijs * Math.pow(0.9, leeftijd);
	}

}
