package strategyPattern;

public class Animal {
	private String name;
	private int weight;
	private String sound;

	public Flys flyType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0)
			this.weight = weight;
		else
			System.out.println("Weight should not be less than 0");
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void setFlyType(Flys newFlyType){
		flyType=newFlyType;
	}
	public String tryToFly(){
		return flyType.fly();
	}

}
