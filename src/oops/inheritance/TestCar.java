package oops.inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMWchild b = new BMWchild();
		b.start(); // Overridden Method
		b.stop(); // inherited Method
		b.reFuel(); // Inherited Method
		b.autoParking(); // child class method
		b.engine(); //Inherited Method from grand parent
		BMWchild.display(); // static method. Not overridden. Static methods can not override and accessing via Class Name
		
		System.out.println("\n....Car Class Object....");
		//child class properties (methods) can not access by parent class object
		CarParent c = new CarParent();
		c.start(); //parent class method
		c.stop(); //parent class method
		c.reFuel(); //parent class method
		c.engine();
		//autoParking method can not access. Since Parent class can not inherit child class properties
		//autoParking method is purely child class method
		CarParent.display(); // it is static method , hence access via Class Name
		
		System.out.println(".....Top Casting.........................");
		//Top Casting
		CarParent c1 = new BMWchild(); // child class Object can be referred by Parent class reference variable
		c1.start(); //Overridden method
		c1.start(); //inherited Method
		c1.reFuel(); //inherited Method
		c1.engine(); //inherited Method
		//autoParking method can not access. since  it fails 'reference type check'
		//java perform reference type check while accessing child class method with parent class reference variables
		//autoParking method is purely child class method. hence it can not access
		
		VehicleGrandParent v1 = new BMWchild();
		v1.engine(); 
		
		
		System.out.println("\n.....Down Casting...not allowed in Java.....");
		//down Casting: Parent Class Object can be referred by Child class reference variable
		
		BMWchild b1 = (BMWchild) new CarParent(); //ClassCastException - down casting in java not allowed.
		b1.start(); 
		//while doing down casting we won't get any compile Time errors but will get Run Time Error: ClassCastException
		
		BMWchild b2 = (BMWchild) new VehicleGrandParent(); //ClassCastException: oops.inheritance.VehicleGrandParent cannot be cast to oops.inheritance.BMWchild
		
		b2.engine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
