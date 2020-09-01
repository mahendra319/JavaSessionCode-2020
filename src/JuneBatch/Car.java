package JuneBatch;

public class Car {
//class variables
	String name;
	String color;
	int price;
	static int wheels ;
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.name="Audi";
		c1.color="Red";
		c1.price=50;
		wheels = 4; // static variable
		
		System.out.println(c1.name +c1.color+c1.price+Car.wheels);
		
		c2.name="BMW";
		c2.color="Black";
		c2.price=55;
		wheels = 4; // static variable 
		System.out.println(c2.name +c2.color+c2.price+wheels);
		
	}

}
