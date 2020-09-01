package encapsulationTest;

public class StudentExten {

	public static void main(String[] args) {
		
		//set class variable using Constructor
		Student st = new Student("kotike",319,2020);
		
		//get values using getter method
		String sName = st.getStudentName();
		int sRno = st.getStudentRollNo();
		int sID = st.getStudentId();
		
		System.out.println("......Student details............");
		System.out.println("Student Name: "+sName);
		System.out.println("Student Rollno: "+sRno);
		System.out.println("Student Id: "+sID);
		

	}

}
