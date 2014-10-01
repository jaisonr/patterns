package factoryPattern;

public class ShipFactory {
	public EnemyShip createShip(String type) {
		if (type.equals("R")) {
			return new RocketShip();
		} else if (type.equals("U")) {
			return new UFOShip();
		} else {
			return null;
		}
	}

}
