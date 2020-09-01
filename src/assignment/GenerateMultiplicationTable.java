package assignment;

public class GenerateMultiplicationTable {
	
	public void MulitplcationTable(int num) {
		for (int i =1; i<=10; i++) {
			
			System.out.printf("%d * %d = %d\n", num,i,num*i);
			
		}
		
	}

	public static void main(String[] args) {
		
		GenerateMultiplicationTable mTable = new GenerateMultiplicationTable();
		mTable.MulitplcationTable(10);
		
		

	}

}
