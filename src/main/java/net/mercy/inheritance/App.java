package net.mercy.inheritance;

public class App {
	public static void main(String[] args) {
		Instructor i = new Person();
		i.teach();
		SoccerPlayer sp = new Person();
		sp.kick();
		Person p = new Person();
		p.walk();
	}
}
