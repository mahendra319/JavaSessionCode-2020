package JuneBatch;

public class EncapsulationCollege {
	
	public String cName;
	public int studentCnt;
	private String grades;
	
//getter and setter methods, are another technique to access Class variables (which constructor do)
	//set data and get data - sequence
	//setter and getter should be public ...

	public void setName(String cName) {
		this.cName=cName;
	}
	public String getName() {
		return cName;
	}
	public int getStudentCnt() {
		return studentCnt;
	}
	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	
}
