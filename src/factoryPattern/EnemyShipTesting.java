package factoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		ShipFactory shipFactory=new ShipFactory();
		EnemyShip ship=null;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Ship type:");
		String type=in.nextLine();
		ship=shipFactory.createShip(type);
		action(ship);
	}

	private static void action(EnemyShip ship) {
		ship.displayEnemyShip();
		ship.followHeroShip();
		ship.attack();
	}

}
