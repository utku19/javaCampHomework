package javaKampHomework;

public class StudentManager {
	
	public void getStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName());
	}
	
	public void getAge(Student student) {
		System.out.println("Öğrenci yaşı: " + student.getAge());
	}
	
	
}
