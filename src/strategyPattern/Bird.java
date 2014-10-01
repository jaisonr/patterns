package strategyPattern;

public class Bird extends Animal {
	public Bird() {
		super();
		setFlyType(new CanFly());
	}
}
