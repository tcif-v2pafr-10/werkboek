package nl.hu.pafr.ootest;

import java.util.ArrayList;
import java.util.List;

public class BedrijfsInventaris {
	private String bedrijfsnaam;
	private double budget;
	private List<Goed> alleGoederen;
	
	public BedrijfsInventaris(String bedrijfsnaam, double budget) {
		this.bedrijfsnaam = bedrijfsnaam;
		this.budget = budget;
		alleGoederen = new ArrayList<>();
	}
	
	public void schafAan(Goed goed) {
		alleGoederen.add(goed);
	}
	
	@Override
	public String toString() {
		return "BedrijfsInventarisatie [bedrijfsnaam=" + bedrijfsnaam + ", budget=" + budget + ", alleGoederen="
				+ alleGoederen + "]";
	}

	public String getBedrijfsnaam() {
		return bedrijfsnaam;
	}
	public void setBedrijfsnaam(String bedrijfsnaam) {
		this.bedrijfsnaam = bedrijfsnaam;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getWaarde() {
		double waarde = 0.0;
		for (Goed goed : alleGoederen) {
			System.out.println(goed+ " - "+ goed.huidigeWaarde());
			waarde = waarde + goed.huidigeWaarde();
		}
		return waarde;
		
	}
	

}
