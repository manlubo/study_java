package lesson09;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		
		animals[0] = new Human();
		animals[1] = new Human();
		animals[2] = new Dog();
		animals[3] = new Parrot();
		
		Talkable[] talkable = new Talkable[3];
		talkable[0] = new Human();
		talkable[1] = new Parrot();
		talkable[2] = new Speaker();
		for(Talkable t : talkable) {
			t.talk(); 
			
		}
		
		
		Human human = new Human();
		Speaker speaker = new Speaker();
		Dog dog = new Dog();
		System.out.println(speaker instanceof Talkable);
		System.out.println(human instanceof Human);
		System.out.println(human instanceof Animal);
		System.out.println(human instanceof Talkable);
		System.out.println(dog instanceof Talkable);
		
	}
}
