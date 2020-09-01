package JuneBatch;

public class StringConcepts {

	public static void main(String[] args) {
		
		String str = "Hello Java World";
		String str1 = "Welocme";
		System.out.println(str);
		System.out.println("Hello Selenium World");
		System.out.println(10); // 10 is a value
		
		System.out.println(str1+str); // WelcomeHello Java World
		
		int a = 20; 
		int b = 30;
		
		System.out.println(str+a); //Hello Java World20
		
		System.out.println("Sum of a & b is: " + a+b); // Sum of a& b is: 2030
		
		System.out.println("Sum of a & b is: "+ (a+b)); //Sum of a & b is: 50
		
		char ch = 'm';
		
		System.out.println("Gender is : " + ch); // Gender is m
		
		
// ASCII values 
		// A to Z : 65 to 90
		// a to z : 97 to 122
		// 0 to 9: 48 to 57
		char ch1 = 'a';
		char ch2 = 'b';
		
		System.out.println(ch1+ch2);// 195 - it will take ASCII values a = 97 and b = 98 
	

	}

}
