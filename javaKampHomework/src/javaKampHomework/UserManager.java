package javaKampHomework;

public class UserManager {
	
	public void signIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarýyla giriþ yaptýnýz.");
	}
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " çýkýþ yaptýnýz.");
	}
}
