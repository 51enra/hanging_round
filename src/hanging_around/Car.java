package hanging_around;

public class Car extends Vehicle {
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	@Override
	public String doStuff() {
		return "zoom zoom zoom";
	}

}
