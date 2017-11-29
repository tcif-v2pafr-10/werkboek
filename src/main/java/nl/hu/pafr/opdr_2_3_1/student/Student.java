package nl.hu.pafr.opdr_2_3_1.student;

public class Student extends Persoon {
	public Student(String id, String voornaam, String achternaam) {
		super(id, voornaam, achternaam);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", voornaam=" + voornaam + ", achternaam=" + achternaam + "]";
	}

}
