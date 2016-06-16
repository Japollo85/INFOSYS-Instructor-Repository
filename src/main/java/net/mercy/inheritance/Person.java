package net.mercy.inheritance;

public class Person implements Instructor, SoccerPlayer {

	public void kick() {
		System.out.println("kick the ball");
	}

	public void teach() {
		System.out.println("teach the class");
	}
	
	public void walk(){
		System.out.println("go take a walk");
	}

}
