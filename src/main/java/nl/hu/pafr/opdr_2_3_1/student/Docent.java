package nl.hu.pafr.opdr_2_3_1.student;

public class Docent extends Persoon {
	public Docent(String id, String voornaam, String achternaam) {
		super(id, voornaam, achternaam);
	}
	
	@Override
	public String toString() {
		return "Docent [id=" + id + ", voornaam=" + voornaam + ", achternaam=" + achternaam + "]";
	}


}
