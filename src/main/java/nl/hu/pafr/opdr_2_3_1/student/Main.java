package nl.hu.pafr.opdr_2_3_1.student;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Groep groep = new Groep();
		groep.setDocent(new Docent("Berend","Wilkens","1234567"));
		groep.setDocent(new Docent("Jeroen","Weber","1234567"));
//		groep.addStudent(new Student("13","Kees", "haverkamp"));
		Student s = new Student("12","Edo", "Draanen");
		groep.addStudent(s);
		groep.addStudent(new Student("12","Edo", "Draanen"));
		groep.addStudent(s);
//		groep.addStudent(new Student("11", "Noor","Ewijk"));
		System.out.println(groep);
//		System.out.println(groep.getStudentById("11"));
	}

}
