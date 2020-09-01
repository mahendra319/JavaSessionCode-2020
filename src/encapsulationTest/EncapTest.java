package encapsulationTest;

public class EncapTest {

	public static void main(String[] args) {
		
		Number num = new Number();
		System.out.println("...Accessing class vars with help of setters and getters....");
		num.setY(6);
		int n =num.getY();
		System.out.println(n);

	}

}
