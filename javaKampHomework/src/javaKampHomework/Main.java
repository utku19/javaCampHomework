package javaKampHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Utku berk", "G�k", "gok123@gmail.com", "a1b2c3", 12341234, 24 );
		
		Instructor instructor = new Instructor(1, "Engin", "Demiro�", "demirog123@gmail.com", "dasdada", "yaz�l�m", "Java", "Uzman");
		
		Course course = new Course(2, "Java", 78);
		
		Category category = new Category(5, "Yaz�l�m");
		
		UserManager userManager = new UserManager();
		userManager.signIn(student);
		userManager.signIn(instructor);
		userManager.signOut(student);
		userManager.signOut(instructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.getStudent(student);
		studentManager.getAge(student);
		
		InstructorManager instructorManager =new InstructorManager();
		instructorManager.experience(instructor);
		
		CourseManager courseManager = new CourseManager();
		courseManager.saveToCourse(course);
		courseManager.getCourse(course);
		
		CategoryManager categoryManager= new CategoryManager();
		categoryManager.getCategory(category);
	}

}
