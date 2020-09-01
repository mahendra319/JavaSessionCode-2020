package JuneBatch;

public class EncapsulationCollegeExtension {

	public static void main(String[] args) {
		
		EncapsulationCollege c1 = new EncapsulationCollege();
		c1.setName("IISC Banglore");
		c1.setStudentCnt(1000);
		c1.setGrades("AA");
		
		String name = c1.getName();
		System.out.println(name);
		
		System.out.println(c1.getStudentCnt());
		System.out.println(c1.getGrades()); // this is private variable and 
		
		
		
		
		
		
		
		
		
		

	}

}
