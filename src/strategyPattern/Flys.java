package strategyPattern;

public interface Flys {
	String fly();
}
class CanFly implements Flys{

	@Override
	public String fly() {
		return "I am flying";
	}
}
class CantFly implements Flys{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can't fly";
	}
}