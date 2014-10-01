package strategyPattern;

public class Dog extends Animal {
	public Dog() {
		super();
		setSound("Bark");
		setFlyType(new CantFly());
	}
	public void bite(){
		System.out.println("Biting........");
	}
}
