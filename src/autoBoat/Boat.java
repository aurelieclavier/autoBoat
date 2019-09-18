package autoBoat;

public class Boat extends Vehicle {

	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String doStuff() {
		return "Je suis " + super.getBrand() + " et je fais glou glou !";
	}

}
