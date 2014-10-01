package designPatterns;

public class WorkWithAnimals {
	//private int num=10;
	public static void main(String[] args) {
		Dog lab=new Dog();
		lab.setName("Jony");
		System.out.println("Name of the dog is: "+lab.getName());
		lab.bite();
		
		
		Animal pup=new Dog();
		Animal kitten=new Cat();
		
		System.out.println("A Puppy says : "+pup.getSound());
		System.out.println("A Kitten says : "+kitten.getSound());
		
		
		((Dog) pup).bite();      //Cannot call bite() from Animal object because it is not the method of Animal
		
	//	System.out.println(""+num);      Cannot reference a non static field in a static function
		
		
	}
}	
