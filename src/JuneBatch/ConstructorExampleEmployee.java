package JuneBatch;

import java.util.ArrayList;

public class ConstructorExampleEmployee {
	
	
	//Class Variables
	
	String name;
	int empId;
	int age;
	double salaray;
	boolean isPermanent;
	String role;
	String companyName;
	ArrayList<String> deviceList;
	
	//constructor
	//We can create constructor with all class variables or partial class variables
	
	//constructor with partial class variables
	public ConstructorExampleEmployee(String name, int age)	{ // name and age are local variables (local to this constructor)
		//this is a keyword, is used to access class variables
		this.name = name; // assigning local variable values name, age (ex: mahi and 39) to class variables with help of 'this' keyword
		this.age = age;
		
	}
	public ConstructorExampleEmployee(String name, int age, int empId) {
		this.name=name;
		this.age=age;
		this.empId=empId;
	}
	
	public ConstructorExampleEmployee(String name, double salaray, String role) {
		this.name = name;
		this.salaray = salaray;
		this.role = role;
	}
	//constructor with all class variables
	public ConstructorExampleEmployee(String name, int empId, int age, double salaray, boolean isPermanent, String role,
			String companyName, ArrayList<String> deviceList) {
		
		this.name = name;
		this.empId = empId;
		this.age = age;
		this.salaray = salaray;
		this.isPermanent = isPermanent;
		this.role = role;
		this.companyName = companyName;
		this.deviceList = deviceList;
	}
	
	public ConstructorExampleEmployee(String name, int empId, ArrayList<String> deviceList) {
		
		this.name = name;
		this.empId = empId;
		this.deviceList = deviceList;
	}
	public static void main(String[] args) {
		
		ArrayList<String> devList = new ArrayList<String>();
		devList.add("iPhoneX");
		devList.add("Mac book pro..");
		devList.add("Samsung Galaxy");
		
		ConstructorExampleEmployee e1 = new ConstructorExampleEmployee("Mahi",39);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println("....................");
		ConstructorExampleEmployee e2 = new ConstructorExampleEmployee("Karthika",34,211475);
		
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.empId);
		System.out.println("....................");
		
		
		ConstructorExampleEmployee e3 = new ConstructorExampleEmployee("Karthika",211475,34,75.5,true,"TestLead","DXC", devList);
		
		System.out.println(e3.name+" "+e3.age+" "+e3.empId+" "+e3.salaray+" "+e3.role+" "+e3.companyName+" "+e3.deviceList.size());
		System.out.println(e3.deviceList.get(0));// to get speicific device from the list
		
		System.out.println("...............");
		
		ConstructorExampleEmployee e4 = new ConstructorExampleEmployee("Kotike",210,devList);	
		System.out.println(e4.name+" "+e4.empId+" "+e4.deviceList);

		

	}

}
