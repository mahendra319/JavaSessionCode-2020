package oops.inheritance;

public class CarParent extends VehicleGrandParent{
	
	
	public void start() {
		System.out.println("car...Start");
	}
	public void stop() {
		System.out.println("Car...Stop");
	}
	public void reFuel() {
		System.out.println("Car...Refuel");
	}
	
	
	public static void display() {
		
		System.out.println("Car.....display");
	}
	
	
	

}
