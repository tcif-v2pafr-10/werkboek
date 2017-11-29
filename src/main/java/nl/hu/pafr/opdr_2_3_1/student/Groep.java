package nl.hu.pafr.opdr_2_3_1.student;

import java.util.ArrayList;
import java.util.List;

public class Groep {
	private List<Student> studentList = new ArrayList<>();
	private Docent docent;
	
	public void addStudent(Student student) {
		if (!studentList.contains(student)) {
			studentList.add(student);
		}
	}
	
	public Student getStudentById(String id){
		for (Student student : studentList){
			if (student.id == id) {
				return student;
			}
		}
		return null;
	}
	
	public void setDocent(Docent docent) {
		this.docent = docent;
	}

	@Override
	public String toString() {
		return "Groep [ls=" + studentList + ", docent=" + docent + "]";
	}

	
}
