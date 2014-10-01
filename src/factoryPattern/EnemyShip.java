package factoryPattern;

public abstract class EnemyShip {
	private String name;
	private int damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void displayEnemyShip(){
		System.out.println("I'm "+this.name);
	}
	public void followHeroShip(){
		System.out.println(""+this.name+" is folowing Hero's ship");
	}
	public void attack(){
		System.out.println(getName()+" attacked Hero's ship and caused "+getDamage()+" Damage");
	}

}
