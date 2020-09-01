package JuneBatch;

public class Users {
	
	String uName;
	int age;
	
	public Users(String uName, int age) {
		this.uName = uName;
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Users u1 = new Users("kotike",39);
		Users u2 = new Users("Mahi",35);
		
		System.out.println(u1.uName+" "+u1.age);
		System.out.println(".......................");
		u1=null;
		//u1 object reference disconnect from object(u1) and pointing to Java nullpointer hence throws NUllPointerException
		//System.out.println(u1.uName+" "+u1.age); //NullPointerException
		//this above concept is called Null Reference Check
		System.out.println(".................");
		u1=u2;
		//both pointing to u2 object
		System.out.println(u1.uName+" "+u1.age);
		System.out.println(u2.uName+" "+u2.age);
		

	}

}
