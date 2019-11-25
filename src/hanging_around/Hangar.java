package hanging_around;

public class Hangar {
	
	public static void main(String[] args) {	
		Boat titanic = new Boat("Steamship", 0);
		Car porsche = new Car("Sportscar", 100000);	
		System.out.println("I am a "+ titanic.getBrand() + " and I go " + titanic.doStuff() + "!");
		System.out.println("I am a "+ porsche.getBrand() + " and I go " + porsche.doStuff() + "!");	
	}
}
