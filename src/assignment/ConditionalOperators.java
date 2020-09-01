package assignment;

public class ConditionalOperators {

	public static void main(String[] args) {
		
//1. Take three numbers from the user and print the greatest number. 
		int a = 78;
		int b = 87;
		int c = 25;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

//2. Write a Java program to test a number is positive or negative.
		
		int x = -11;
		int y = 35;
		
		if(x>=0)
		{
			System.out.println("x is Postitive number");
		}
		else
		{
			System.out.println("x is Negative Number");
		}
		if(y>=0)
		{
			System.out.println("y is Positive Number");
		}
		else
		{
			System.out.println("y is Negative number");
		}
		
		
		
		
	}

}
