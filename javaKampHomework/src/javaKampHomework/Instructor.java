package javaKampHomework;

public class Instructor extends User {
	
	private String branch;
	private String courses;
	private String experience;
	
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String branch, String courses, String experience) {
		super(id, firstName, lastName, email, password);
		this.branch = branch;
		this.courses = courses;
		this.experience = experience;	
	}
	
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
}
