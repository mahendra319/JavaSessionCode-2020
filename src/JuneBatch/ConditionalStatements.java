package JuneBatch;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =40;
		int b = 40;
		
		if (b>a) // boolean
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("a is greater or equal to b");
		}
		
		if (a==40) {
			System.out.println("a is equals to 40");
		}

// else part is dead code
		if (true)
		{
			System.out.println("Hii...");
		}
		else
		{
			System.out.println("Bye...."); // its a dead code . since we explicitly made condition true (if(true)). so it will never come to else part.
		}

// if part is dead code.
		if (false)
		{
			System.out.println("Hii...."); // here it is dead code. Since we explicitly made condition false.  it will never come into if condition.
		}
		else
		{
			System.out.println("Bye.....");
		}
		
		int num = 29;
		
		if (num<=100 && num >= 30)
		{
			System.out.println("Pass");
			if(num >= 80)
			{
				System.out.println("Grade A");
			}
			if (num >= 50 && num <=80)
			{
				System.out.println("Grad B");
			}
		}
		else
		{
			System.out.println("FAIL");
		}
		
		int total = 100;
		
		if (total>=100)
		{
			System.out.println("Hi...." + total);
			total = total +300;
		}
		if (total>=200)
		{
			System.out.println("Helloo...."+total);
			total = total + 300;
		}
		if (total>=300)
		{
			System.out.println("Bye...."+ total);
		}
//if elseif elseif
		
		String name = "karthi";
		int marks = -1;
		
		if (name.equals("mahi"))
		{
			marks = 95;
		}
		else if(name.equals("karthi"))
		{
			marks =99;
		}
		else if(name.equals("kotike"))
		{
			marks = 5;
		}
		
		else
		{
			System.out.println("Student "+name+" is not found");
		}
		
	System.out.println(name + ": "+ marks);	
		
// Write a Program to get highest number
	
	int a1 = 1000;
	int b1 =750;
	int c = 300;
	
	//&& -- AND Operator - also called short circuit Operator
	//|| --OR operator
	if (a1>b1 && a1>c)
	{
		System.out.println("a1 is greater");
	}
	else if(b1>c)
	{
		System.out.println("b1 is greater");
		
	}
	else
	{
		System.out.println("c is greater");
	}
		
		
		
		
		
		
		
	}

}
