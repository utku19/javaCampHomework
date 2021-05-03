package javaKampHomework;

public class CourseManager {
	
	public void saveToCourse(Course course) {
		System.out.println(course.courseName + " kursuna kayıt oldunuz.");
	}
	
	public void getCourse(Course course) {
		System.out.println(course.courseName + " kurs sayfası açıldı.");
	}
}
