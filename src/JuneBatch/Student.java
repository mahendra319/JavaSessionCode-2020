package JuneBatch;

public class Student {
	
	String sName;
	int sRollno;
	String cName;
	
	public Student(String sName, int sRollno, String cName) {
		this.sName = sName;
		this.sRollno = sRollno;
		this.cName = cName;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Karthi",10,"First Class");
				
		Student s2 = new Student("Mahi",11,"Second Class");
		
		Student s3 = new Student("Kotike",12,"Third Class");
		
		System.out.println(s1.sName+" "+s1.sRollno+" "+s1.cName);
		System.out.println(s2.sName+" "+s2.sRollno+" "+s2.cName);
		System.out.println(s3.sName+" "+s3.sRollno+" "+s3.cName);
		System.out.println("...................");
		
		s1=s2; // s1 object reference will disconnect with Object(s1) and pointing to s2 (along with s2)
		System.out.println(s1.sName+" "+s1.sRollno+" "+s1.cName);
		System.out.println(s2.sName+" "+s2.sRollno+" "+s2.cName);
		System.out.println(s3.sName+" "+s3.sRollno+" "+s3.cName);
		System.out.println("...................");
		
		s2=s3; // s2 object reference disconnect from Object (s2) and pointing to s3(along with s3)
		System.out.println(s1.sName+" "+s1.sRollno+" "+s1.cName);
		System.out.println(s2.sName+" "+s2.sRollno+" "+s2.cName);
		System.out.println(s3.sName+" "+s3.sRollno+" "+s3.cName);
		System.out.println("...................");
		
		s3=s1; // s3 object reference disconnect from object(s3) and pointing to s1 (along with s1, but currently s1 pointing to s2 object properties)
		System.out.println(s1.sName+" "+s1.sRollno+" "+s1.cName);
		System.out.println(s2.sName+" "+s2.sRollno+" "+s2.cName);
		System.out.println(s3.sName+" "+s3.sRollno+" "+s3.cName);
		System.out.println("...................");		
			
		//the above concept is called Reference Exchange
		

	}

}
