package javaKampHomework;

public class UserManager {
	
	public void signIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar�yla giri� yapt�n�z.");
	}
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� yapt�n�z.");
	}
}
