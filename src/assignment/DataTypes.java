package assignment;

public class DataTypes {
		
	public static void main (String [] args )
	{
//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		System.out.println("Hello");
		System.out.println("Mahi K");

//2. Write a Java program to print the sum of two numbers. 		
		System.out.println("Sum is :" + (74+36));

//3. Write a Java program to divide two numbers and print on the screen. 
		int k =50;
		int j = 3;
		System.out.println(k/j);

//4. Write a Java program to print the result of the following operations. Change your test data accordingly.	
		System.out.println(-5+(8*6));
		
		System.out.println((55+9)%9);
		
		System.out.println(20+(-3*5)/8);
		
		System.out.println(5+(15/3)*2-(8%3));

//5. Write a Java program to compute the specified expressions and print the output. Go to the editor	
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );

//6. Try to concat "Hello Selenium" with a character 't'.
		String s ="Hello Selenium";
		char ch = 't';
		System.out.println(s+ch);

//7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : "Your Total amount is. 3700".
		int a=100;
		int b = 200;
		int c = 3400;
		int total = a+b+c;
		System.out.println("Your Total amount is: "+ total);
//8. What should be the output for :
		//output: 53 since it is Octal number. the number which start from Zero(0) is a Octal number
		//065 = (0*8^2)+(6*8^1)+(5*8^0) = (0)+(48)+(5) = 53
		
		byte b3 = 065;
		System.out.println(b3); //output: 53 
		
		int in = 027;
		System.out.println(in); //23 ((0*8^2)+(2*8^1)+(7*8^0))=0+16+7=23
		
		
		
		
	}

}
