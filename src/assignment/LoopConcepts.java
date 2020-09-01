package assignment;

public class LoopConcepts {

	public static void main(String[] args) {
	
//1. WAP to print following output: I am Batman
			int i=1;
			while(i<=5) {
				System.out.println("I am Batman\n");
				i++;
			}
System.out.println("....Program 2..........\n");
//2. WAP to print following output: I am Batman 1 ...I am Batman 9
			for(int b=1; b<10; b++) {
				System.out.println("I am Batman "+b+"\n");
			}
//3. WAP to print 10 to 1 using for, while and do-while loop
			System.out.println(".....Program 3.......Print 10 to 1 using while loop.........");
			int a=10;
			while(a>0) {
				System.out.println(a);
				--a;
			}
			System.out.println(".....Print 10 to 1 using for loop.........");
			for(int c=10; c>0; c--) {
				System.out.println(c);
			}
			System.out.println(".....Print 10 to 1 using do while loop.........");
			int d=10;
			do {
				System.out.println(d);
				d=d-1;
			}while(d>0);
//4. Write a program in Java to print "Hello World" ten times using while loop		
		System.out.println("....Program 4..........");
			int j=1;
		while(j<=10) {
			System.out.println("Hello World");
			j++;
		}
//5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		System.out.println("....Program 5......");
		int k =1;
		while(k<=10) {
			if(k % 7!=0) {
				System.out.println(k);
				}
			k++;			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
