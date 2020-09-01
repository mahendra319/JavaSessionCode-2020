package assignment;

public class Arrays {

	public static void main(String[] args) {
//1: Write a program to print the following pattern using for loop:

  int cnt=0; 
  String frmt = "0%d "; 
  for(int row=0; row<4; row++) { 
	  for (int col=0; col<10; col++) { 
		  System.out.format(frmt,cnt); 
		  cnt++; }
	  	System.out.println("\n"); 
	  	frmt = frmt.replace("0", ""); 
	  }
 
		//OR
		for(int row=0; row<10; row++) {
			for (int col=0; col<10; col++) {
			System.out.print(row+""+col+" ");
			
			}
			System.out.println();
			//frmt = frmt.replace("0", "");
		}
//Question 2: Write a program to create a static Array, having following cricket data:name, age, team name, DOB, gender, Strike Rate
		Object player1[] = new Object[6];
			player1[0]= "Sachin";
			player1[1]=47;
			player1[2]="India";
			player1[3]="04/24/1973";
			player1[4]='M';
			player1[5]= 90.31;
			System.out.println("....Scahin Info.........");
			for (Object c1 : player1) {
				System.out.println(c1);
			}
		Object player2[] = new Object[6];
			player2[0]= "MRaj";
			player2[1]=38;
			player2[2]="India";
			player2[3]="01/03/1982";
			player2[4]='F';
			player2[5]= 45.37;
			System.out.println("....Mithali Raj Info.........");
			for (Object c2 : player2) {
				System.out.println(c2);
			}		
		Object player3[] = new Object[6];
			player3[0]= "MBevan";
			player3[1]=50;
			player3[2]="Australia";
			player3[3]="05/08/1970";
			player3[4]='M';
			player3[5]= 74.2;
			System.out.println("....Michael Bevan Info.........");
			for (Object c3 : player3) {
				System.out.println(c3);
			}	
//Question 3: Try to print the following pattern on the console:
			System.out.println(".......Program 3.............");
			int j[]= new int[5];
			for(int k=j.length-1; k>=0; k--) {
				System.out.println("n = "+k);
				}
			
					
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
