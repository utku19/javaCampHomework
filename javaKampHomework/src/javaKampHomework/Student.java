package javaKampHomework;

public class Student extends User {
	
	private int studentNo;
	private int age;
	
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String password, int studentNo, int age) {
		super(id, firstName, lastName, email, password);
		this.studentNo = studentNo;
		this.age = age;
	}
	
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
