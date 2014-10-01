package designPatterns;

public class Dog extends Animal {
	public Dog() {
		super();
		setSound("Bark");
	}
	public void bite(){
		System.out.println("Biting........");
	}
}
