package nl.hu.pafr.ootest;

public class Main {

	public static void main(String[] args) {
		BedrijfsInventaris bedrijfsInventaris = new BedrijfsInventaris("Hogeschool Utrecht", 1000.0);
		bedrijfsInventaris.schafAan(new Auto("Ford Focus", 20000.0, 2014, "23-SEF-1"));
		bedrijfsInventaris.schafAan(new Fiets("Batavus", 700.0, 2017, 12345));
		bedrijfsInventaris.schafAan(new Computer("Lenovo i5", "F4-8C-50-BA-63-23", 12345, 2016));
		bedrijfsInventaris.schafAan(new Meubel("Tafel", 1000, 2010));
		System.out.println(bedrijfsInventaris);
		System.out.println("Huidige waarde invetaris: "+bedrijfsInventaris.getWaarde());
	}

}
