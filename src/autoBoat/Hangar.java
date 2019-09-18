package autoBoat;

public class Hangar {

	public static void main(String[] args) {
		Car newCar = new Car("Clio", 24000);
		Boat newBoat = new Boat("Titanic", 500);
	
		System.out.println(newCar.doStuff());
		System.out.println(newBoat.doStuff());
	}

}
