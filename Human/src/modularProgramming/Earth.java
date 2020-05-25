package modularProgramming;

public class Earth {
	
	/*
	 * This application is another short program showing how 
	 * divide our code into smaller modular portions. This enables us 
	 * to re-use the code needed so we won't have to re-write the 
	 * whole Human.java class logic over in the main() method. 
	 * 
	 */
	public static void main(String args[]) {
	
		Human jose;
		
		jose = new Human();
		jose.age = 34;
		jose.eyeColor = "brown";
		jose.heightInInches = 45;
		jose.name = "Smooth Jose";
		jose.food = "mexican food";
		jose.foodReason = "I'm Mexican";
		jose.destination = "beach";
		jose.destReason = "I'm a Cancer in astrology symbols";
		jose.job = "construction worker";
		jose.jobReason = "I like building people's home";
		// when it gets to here all values should be filled
		//and when jose speaks it mentions it's attributes
		jose.speak();
		jose.eat();
		jose.work();
		
		System.out.println();
		System.out.println();
		System.out.println("***************");
		System.out.println("***************");
		System.out.println();
		System.out.println();
		
		
		Human ramon;
		
		ramon = new Human();
		ramon.age = 21;
		ramon.eyeColor = "green";
		ramon.heightInInches = 56;
		ramon.name = "Ramon tha Great";
		ramon.food = "japanese food";
		ramon.foodReason = "my wife is japanese";
		ramon.destination = "Best Buy";
		ramon.destReason = "I love getting the latest games";
		ramon.job = "software engineer";
		ramon.jobReason = "I enjoy people using my products";
		
		ramon.speak();
		ramon.eat();
		ramon.work();
		
		System.out.println();
		System.out.println();
		System.out.println("***************");
		System.out.println("***************");
		System.out.println();
		System.out.println();
		
		
		Human tom;
		
		tom = new Human();
		tom.age = 26;
		tom.eyeColor = "blue";
		tom.heightInInches = 38;
		tom.name = "Tom Cruz";
		tom.food = "Soul Food";
		tom.foodReason = "I was raised in the South";
		tom.destination = "my house";
		tom.destReason = "I like spending time with my family";
		tom.job = "professional actor";
		tom.jobReason = "I enijoy people laugh";
		
		tom.speak();
		tom.eat();
		tom.work();
		
		
		
	}
}
