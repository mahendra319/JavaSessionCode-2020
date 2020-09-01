package JuneBatch;

import java.util.ArrayList;

public class FunctionsInJava {
	
//can not create a function/method inside another method/function
	//functions are always independent or parallel to each other
	
	//1. no input and no return
	//Void - method can not return anything
	
	/**
	 * return type - Void
	 */
	public void test() {
		System.out.println("test method...");
	}
	public void getName() {
		System.out.println("get Name method...");
	}
	//2. no input and return something
	
	public int add() {
		int a =10;
		int b=20;
		int c= a+b; //30
		
		return c; //30 will return to obj.add() in main method
	}
	
	/**
	 * This method is used to get Trainer Name
	 * @return - String
	 */
	public String getTrainerName() {
		String name ="Naveen";
		return name;
	}
	/**
	 * this method is used to know whether employee is permanent or not
	 * @return - boolean
	 */
	public boolean isPermanent() {
		boolean flag =true;
		return flag;
	}
	
	//3. some input and some return
	/**
	 * This method is used to get sum of two integers
	 * @param x
	 * @param y
	 * @return - int
	 */
	public int sum(int x, int y) {
		int a = x+y;
		return a;
	}
	
	/**
	 * This method is used to get multiplication of two numbers
	 * @param a
	 * @param b
	 * @return - double
	 */
	public double multiply(double a, double b) {
		double d = a*b;
		return d;
	}
	/**
	 * This method is used to get StudentMarks
	 * @param sName
	 * @return - int
	 */
	public int getStudentMarks(String sName) {

		
		int marks=-1;
		System.out.println("Marks for :" +sName);
		
		if (sName.equals("Mahi")) {
			marks = 35;
		}
		else if(sName.equals("Karthi")) {
			marks=95;
		}
		else if(sName.equals("Suri")) {
			marks = 90;
		}
		else {
			System.out.println(sName +"...Not found");
		}
		
		return marks;
		
	}
	
	//WAM where u have to send browser name and launch browser accordingly:
	
	public void launchDriver(String browserName) {
		
		System.out.println("Launching Browser......");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome Browser");
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Launch Mozilla Browser");
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.out.println("Launch IE Browser");
		}
		else
		{
			System.out.println("Browser is not found: "+browserName);
		}
	}
	//WAM - which will take className(String) and return list of students in that class (static Array)
	public String[] getStudentNames(String className) {
		String studentNames [] = new String[5];
		if (className.equalsIgnoreCase("first")) {
			
			studentNames[0] = "Mahi";
			studentNames[1] = "Karthi";
			studentNames[2] = "Pallu";
			studentNames[3] = "suri";
			studentNames[4] = "Ravi";
		}
		if (className.equalsIgnoreCase("second")) {
			
			studentNames[0] = "Malli";
			studentNames[1] = "Naga";
			studentNames[2] = "Rao";
			studentNames[3] = "babu";
			studentNames[4] = "kanth";
		}
			return studentNames;	
	}
	
	//WAM - which will take eccommerce siteName and return list of products on that page.
	
	public ArrayList<String> getProductsList(String siteName) {
		
		System.out.println("...Get the list of Products ..."+siteName);
		
		ArrayList<String> productList = new ArrayList<String>();
		
		if (siteName.equals("filpkart")) {
			productList.add("Apple iphoneX");
			productList.add("Apple Mac book");
			productList.add("Apple ipod");
		}
		else if(siteName.equals("amazon")) {
			productList.add("Apple iphoneX");
			productList.add("Apple wathch");
			productList.add("Nike shoes");
		}
		else if(siteName.equals("wlamart")) {
			productList.add("LG TV");
			productList.add("Apple Mac book");
			productList.add("Nike tshirt");
		}
		else
		{
			System.out.println("Product list is not available for site.."+siteName);
		}
		return productList;
	}
	//WAM - Which will decide the person is US Citizen or not
	
	public boolean isUSCitizen(String pName) {
		System.out.println("Status for ...."+pName);
		boolean status = false;
		
		if(pName.equals("Mahi")) {
			return status;
			
		}
		else if(pName.equals("Karthi")) {
			status = true;
			return status;
		}
		else if(pName.equals("Kotike")) {
			return status;
		}
		else
		{
			System.out.println(pName +" Person not found...");
			return status;
		}
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		//create object of class
		FunctionsInJava obj = new FunctionsInJava(); // RightHandSide part is Object (i.e. new FunctionsInJava) and Obj is object name/object reference name
		obj.test();
		obj.getName();
		int tot = obj.add();
		System.out.println(tot);
		String trainer = obj.getTrainerName();
		System.out.println("Trainer name is: "+trainer);
		
		boolean f = obj.isPermanent();
		System.out.println(f);
		
		int s1 = obj.sum(10, 20);
		System.out.println("Sum is: "+s1);
		
		double mul = obj.multiply(5.5, 2.5);
		System.out.println("Multiplication total is: "+mul);
		
		System.out.println(obj.getStudentMarks("Mahi"));
		System.out.println(obj.getStudentMarks("Tom"));
		obj.launchDriver("\nchrome\n");
		obj.launchDriver("\nOpera");
		System.out.println("....................................");
		System.out.println(obj.getStudentNames("first")[0]);
		System.out.println(obj.getStudentNames("first")[1]);
		System.out.println(obj.getStudentNames("first")[2]);
		System.out.println(obj.getStudentNames("first")[3]);
		System.out.println(obj.getStudentNames("first")[4]);
		System.out.println("......OR.............................");
		
		String students []=obj.getStudentNames("second");
		for (String s : students) {
			System.out.println(s);
		}
		
		
		System.out.println("................................");
		
		ArrayList<String> prods=obj.getProductsList("amazon");
		System.out.println("Total Products in site: "+prods.size());
		for (String products : prods) {
			System.out.println(products);
		}
		System.out.println("...............OR.....LAMBDA...............");
		/**
		 * Lambda and Method reference are used for ArrayList and hastmaps
		 * list is a variablename at below 
		 */
		prods.forEach(list ->System.out.println(list)); //-> this symbol is called 'Lambda'. This is Lambda method of displaying
		
		System.out.println(".......OR............METHOD REFRENCE.....................");
		prods.stream().forEach(System.out::println); // this is called Method reference and it is available from 1.8 jdk onwards
		
		System.out.println("........................................");
		System.out.println(obj.isUSCitizen("Mahi"));
		System.out.println(obj.isUSCitizen("Suri"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
