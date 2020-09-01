package encapsulationTest;

public class Student {
	
	private String stdName;
	private int stdRollNo;
	private int stdId;
	
	//constructor to access all class variables
	public Student(String stdName,int stdRollNo, int stdId) {
		this.stdName=stdName;
		this.stdRollNo=stdRollNo;
		this.stdId=stdId;
	}
	
	//getter and setter method to access class variables
	public void setStudentName(String stdName) {
		this.stdName=stdName;
	}
	public String getStudentName() {
		return stdName;
	}
	
	public void setStudentRollNo(int stdRollNo) {
		this.stdRollNo=stdRollNo;
		}
	public int getStudentRollNo() {
		return stdRollNo;
	}
	
	public void setStudentId(int stdId) {
		this.stdId=stdId;
	}
	public int getStudentId() {
		return stdId;
	}
	

}
