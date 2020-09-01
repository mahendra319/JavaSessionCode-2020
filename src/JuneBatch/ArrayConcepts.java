package JuneBatch;

public class ArrayConcepts {

	public static void main(String[] args) {
		
//Arrays: collection of similar kind of data 
		//Static Array : size of Array is fixed
		//integer array
		int i[] = new int[5];
		i[0] = 10;
		i[1]=20;
		i[3]=30;
		i[4]=40;
		
		
		System.out.println("Lowest Index is: "+ 0); //0
		System.out.println("Length is: "+i.length); //5
		System.out.println("Highest index is: "+(i.length-1)); //4

		System.out.println(i[0]); //10
		System.out.println(i[3]); //30
		//System.out.println(i[5]); //ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]); //ArrayIndexOutOfBoundsException - since index always start from 0
		System.out.println(i[2]);// 0 - index is with in size of array and don't have any value assigned, the it will display default value 0
		
		//print all the values from array : for loop
		System.out.println("...print Array values using for loop............");
		for(int k =0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
		//double array
		double d []=new double[3];
		d[0]=23.33;
		d[1]=11.11;
		System.out.println(d[0]); // 23.33
		System.out.println(d[2]); //0.0 - since not declared , displayed default double value 0.0
		
		//char array
		char c[]=new char[2];
		c[0]='a';
		c[1]='b';
		System.out.println(c[0]+c[1]); // 195
		
		//string array
		String s[]=new String[2];
		s[0]="Mahi";
		s[1]="kk";
		System.out.println(s[0]+s[1]);
		
		
		
		
//Object Array: store different types of data 
		
	//ex: store employee's - name, age, salary, gender, isPermenant
		System.out.println("...........Object Array..............");
		Object empData[] = new Object[5];
		empData[0]="Mahi";
		empData[1]=38;
		empData[2]=35.5;
		empData[3]='M';
		empData[4]=true;
		
		for (int j=0;j<empData.length;j++) {
			System.out.println(empData[j]);
		}
		System.out.println("...........Object Array using while loop.....................");
		Object empData1[] = new Object[5];
		empData1[0]="Karthi";
		empData1[1]=33;
		empData1[2]=35.5;
		empData1[3]='F';
		empData1[4]=true;
		
		int m =0;
		while(empData1.length>m) //OR  while(empData1.length-1>=m)
		{
			System.out.println(empData1[m]);
			m++;
		}
		
		
		
		
		
	}

}
