package JuneBatch;

public class Person {
//class variables
	String name;
	int age;
	double weight;
	char gender;
	String dob;
	
	
	
	public static void main(String[] args) {
		
		
		Person p1 = new Person();
		p1.name="Mahi";
		p1.age=39;
		p1.gender='M';
		p1.weight=85;
		p1.dob="26/06/1981";
		
	System.out.println(p1.name+" "+p1.age+" "+p1.gender+" "+p1.weight+" "+p1.dob);
		
		
		Person p2 = new Person();
		
		p2.name="Karthi";
		p2.age=34;
		p2.gender='F';
		p2.weight=55;
		p2.dob="03/04/1986";
		
		System.out.println(p2.name+" "+p2.age+" "+p2.gender+" "+p2.weight+" "+p2.dob);
		
		Person p3 = new Person();
		
		System.out.println(p3.name); // If no values assigned then display default value. default value for sting is null
		System.out.println(p3.age);// If no values assigned then display default value. Default value for int is 0
		System.out.println(p3.gender); // default value for char is 'blank value' (i.e. space)
		System.out.println(p3.weight); // default value for double is 0.0
		System.out.println(p3.dob);
		
		//Can we create object without reference? Yes
		// but garbage collector will destroy object without reference.
		
		new Person();
		new Person().name = "kk"; // one object created for this
		new Person().age = 35; // another object created for this
		
		
		

	}

}
