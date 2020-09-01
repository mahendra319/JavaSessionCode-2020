package JuneBatch;

public class EncapsulationPractice {
	
	private String name;
	private int age;
	private double sal;
	
	private void test() {
		System.out.println("Private method");
		System.out.println("to access from another class follow Encapustion process");
	}
	
	public void getTest() {
		test();
		System.out.println("Encapuslated test() method with public getTest() method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

}
