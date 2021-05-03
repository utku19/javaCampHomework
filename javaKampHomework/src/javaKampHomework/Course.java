package javaKampHomework;

public class Course {
	
	int id;
	String courseName;
	int comletionRate;
	
	
	public Course() {
		
	}
	
	public Course(int id, String courseName, int completionRate) {
		this.id = id;
		this.courseName = courseName;
		this.comletionRate = completionRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getComletionRate() {
		return comletionRate;
	}

	public void setComletionRate(int comletionRate) {
		this.comletionRate = comletionRate;
	}
	
	
}
