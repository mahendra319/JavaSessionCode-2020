package JuneBatch;

public class EncapsulationPracticeExtension {

	public static void main(String[] args) {
		
		EncapsulationPractice ex = new EncapsulationPractice();
		
		System.out.println("...accessing Class variable with help of getter and setters...");
		ex.setName("Karthi");
		ex.setAge(34);
		ex.setSal(44.22);
		
		System.out.println(ex.getName());
		System.out.println(ex.getAge());
		System.out.println(ex.getSal());
		System.out.println("....accessing Encapsulated private Method....");
		ex.getTest();

	}

}
