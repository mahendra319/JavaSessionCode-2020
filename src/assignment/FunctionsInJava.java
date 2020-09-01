package assignment;

public class FunctionsInJava {
//1. Write a program to print the sum of two numbers entered by user by defining your own method.
	public void sumTwoNumbers(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Sum of num1 & num2 is: "+sum);
	}
//2. Define a method that returns the product of two numbers entered by user.	
		public double productTwoNumbers(double n1, double n2) {
			double product = n1*n2;
			return product;
		}
//3. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.	
	public void findCircumfrenceAndAreaOfCircle(float rad) {
		float circum = (2f*3.14f*rad);
		float area = 3.14f*rad*rad;
		System.out.println("Circumfrence of a Circle is: "+circum);
		System.out.println("Area of a Circle is: "+area);
	}
//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.	
	public void findMax(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("a is greater than b and c: "+a);
		}
		else if(b>c) {
			System.out.println("b is greater than a and c: "+b);
		}
		else
		{
			System.out.println("c is greater than a and b: "+c);
		}
	}
	public void findMin(int d, int e, int f) {
		if (d<e && d<f) {
			System.out.println("d is smaller than e & f: "+ d);
		}
		else if (e<f) {
			System.out.println("e is smaller than d & f: "+e);
		}
		else
		{
			System.out.println("f is smaller: "+f);
		}
	}
//5. Define a program to find out whether a given number is even or odd.
	public void findEvenOrOdd(int num) {
		if(num % 2 ==0) {
			System.out.println("Even Number: "+num);
		}else {
			System.out.println("Odd Number: "+num);
		}
	}
//6. A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
	public void findVoteEligibility(int age) {
		if(age>=18) {
			System.out.println("Eligible for Vote: "+age);
		}else {
			System.out.println("Not Eligible for Vote: "+age);
		}
			
	}
//7. Define a method to find out if number is prime or not.
	public void findPrimeNumber(int pNum) {
		int flag =0;
		int i =2;
		if(pNum==0 || pNum==1) {
			System.out.println(pNum+ " is Not a PrimeNumber");
		}else {
			
			while(i<=pNum/2) {
				if(pNum % i ==0) {
					System.out.println(pNum+" is not a PRimeNumber");
					flag =1;
					break;
				}
				i++;
				}
			if(flag==0) {
				System.out.println(pNum +" is a PrimeNumber");
			}
		}
	}
//8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
	public void findStudentGrade(int marks) {
		if(marks>90 && marks<=100) {
			System.out.println("Grade is: AA");
		}else if(marks>80 && marks<=90) {
			System.out.println("Grade is: AB");
		}else if(marks>70 && marks<=80) {
			System.out.println("Grade is: BB");
		}else if(marks>60 && marks<=70) {
			System.out.println("Grade is: BC");
		}else if(marks>50 && marks<=60) {
			System.out.println("Grade is: CD");
		}else if(marks>40 && marks<=50) {
			System.out.println("Grade is: DD");
		}else if (marks>=0 && marks<=40) {
			System.out.println("Fail");
		}else {
			System.out.println("Enter  valid marks form 0 to 100");
		}
		
	}
//9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
	public void findFactorialOfNumber(int num) {
		long factorial = 1;
		if(num==0) {
			System.out.printf(" %d! = %d", num,num);
		}else {
			for (int i=1; i<=num; i++) {
				
				factorial = factorial * i;
			}
			System.out.printf("%d! = %d", num, factorial);
		}
	}
	
	public static void main(String[] args) {
		
		FunctionsInJava fun = new FunctionsInJava();
		System.out.println(".......1st Program.....Sum of Two numbers........");
		fun.sumTwoNumbers(15,37);// sum = 52
		System.out.println("\n........2nd Program......Product of Two Numbers.....");
		double prod =fun.productTwoNumbers(5.5, 8.5);
		System.out.println("\"Product of two numbers is: "+prod);
		System.out.println("\n...3rd Program...Circumfrence and Area of Circle......");
		fun.findCircumfrenceAndAreaOfCircle(2.5f);
		System.out.println("\n....4th Program....Max and Min.....");
		fun.findMax(37, 25, 12);
		fun.findMin(6, 13, 15);
		System.out.println("\n...5th Program....find Even or Odd .......");
		fun.findEvenOrOdd(25);
		fun.findEvenOrOdd(18);
		System.out.println("\n...6th program....Vote Eligiblity.....");
		fun.findVoteEligibility(25);
		fun.findVoteEligibility(17);
		System.out.println("\n..7th Program....find Prime Number....");
		fun.findPrimeNumber(31);
		System.out.println("\n..8th Program....Print Student Grade....");
		fun.findStudentGrade(49);
		System.out.println("\n...9th Program...Factorial Number.....");
		fun.findFactorialOfNumber(4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
