package strategyPattern;

public class FlyWithAnimals {
	public static void main(String[] args) {
		Animal pup=new Dog();
		Animal tweety=new Bird();
		
		System.out.println("I am pup "+pup.tryToFly());
		System.out.println("I am tweety "+tweety.tryToFly());
		
		pup.setFlyType(new CanFly());//making pup to fly dynamically
		
		System.out.println("I am pup "+pup.tryToFly());
	}
}
