package modularProgramming;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	String food;
	String foodReason;
	String destination;
	String destReason;
	String job;
	String jobReason;
	

	
	public void speak() {
		System.out.println("Hello, my name is " + name +".");
		System.out.println("I'm " + heightInInches + " inches tall.");
		System.out.println("I'm " + age + " years old.");
		System.out.println("My eye color is " + eyeColor + ".");
	}
	
	public void eat() {
		System.out.println("I enjoy eating " + food + ";");
		System.out.println("because " + foodReason + "."); 
	}
	
	public void walk() {
		System.out.println("I love walking to " + destination + ";");
		System.out.println("because " + destReason + ".");
		
	}
	
	public void work() {
		System.out.println("My job role is a " + job + ";");
		System.out.println("I love this work because " + jobReason + ".");
	}
}

