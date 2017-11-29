package nl.hu.pafr.opdr_2_2.dieren;

public class Main {

	public static void main(String[] args) {
		System.out.println("Vleugels "+Eend.wings);
		Speakable dier = new Eend();
		System.out.println(dier.speak());
		System.out.println(dier);
		
		Koe d1 = new Koe();
		d1.setLitersMelk(100);
		System.out.println(d1.speak());
		System.out.println(d1);
		
	}

}
