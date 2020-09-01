package assignment;

import java.util.ArrayList;

public class ConstructorUniversity {
	
	String uName;
	String country;
	String estdDate;
	ArrayList<String> coursesList;
	//Constructor with all class variables
	public ConstructorUniversity(String uName, String country, String estdDate, ArrayList<String> coursesList) {
		this.uName = uName;
		this.country = country;
		this.estdDate = estdDate;
		this.coursesList = coursesList;
	}
	//constructor with partial class variables
	public ConstructorUniversity(String uName,String estdDate) {
		this.uName=uName;
		this.estdDate=estdDate;
	}
	public ConstructorUniversity(String uName, String country, ArrayList<String> coursesList) {
		this.uName = uName;
		this.country = country;
		this.coursesList = coursesList;
	}
	public static void main(String[] args) {
		ArrayList<String> cList=new ArrayList<String>();
		cList.add("M.Tech");
		cList.add("MSIT");
		cList.add("MBA");
		cList.add("B.Tech");
				
		ConstructorUniversity uni = new ConstructorUniversity("IISC","India","1909",cList);
		//System.out.println(uni.uName+" "+uni.country+" "+uni.estdDate+" "+uni.coursesList);
		System.out.println("............Full class variables.............");
		System.out.println(uni.getuName()+" "+uni.getUniverisityCountry()+" "+uni.getUniversityEstdDate()
		+" "+uni.getCouserList());
		System.out.println("\n............Full class variables.............");
		System.out.println(uni.getuName());
		System.out.println(uni.getUniverisityCountry());
		System.out.println(uni.getUniversityEstdDate());
		System.out.println(uni.getCouserList());
		
		ConstructorUniversity uni2 = new ConstructorUniversity("IIT Kharagpur","1951");
		System.out.println("\n.......Partial class variables...........");
		System.out.println(uni2.getuName()+" "+uni2.getUniversityEstdDate());
		
		ConstructorUniversity uni3 = new ConstructorUniversity("JNTUH","India",cList);
		System.out.println("\n.........Partial Class Variables......");
		System.out.println(uni3.uName);
		System.out.println(uni3.getUniverisityCountry());
		//System.out.println(uni3.getCouserList());
		 System.out.println("Courses Offered:"); 
		  for (String s : uni3.getCouserList()) {
		  System.out.println(s); }
		 
	}
	public String getuName() {
		//System.out.println(uName);
		return uName;
		}
	public String getUniverisityCountry() {
		
		//System.out.println(country);
		return country;
		}
	public String getUniversityEstdDate() {
		
		return estdDate;
	}
	public ArrayList<String> getCouserList() {
		
		return coursesList;
	}
}
