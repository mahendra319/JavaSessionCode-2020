package JuneBatch;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList is a default class available in java. it is a dynamic array
		
		ArrayList ar=new ArrayList(); //raw type ArrayList
		System.out.println(ar.size());//0
		
		ar.add(100); //index: 0
		ar.add(200); // index: 1
		
		System.out.println(ar.size());//2  .length() is for arrays and .size() is for ArrayList
		
		ar.add(300); // 2
		ar.add(400); //3
		
		System.out.println(ar.size());//4
		
		ar.add(500); //4
		ar.add(600); //5
		ar.add(700); //6
		ar.add(800); //7
		ar.add("Java");// 8
		ar.add(12.33); //9
		ar.add('M'); //10
		
		System.out.println(ar.size()); //8
		System.out.println(ar.get(0)); //100
		System.out.println(ar.get(7)); //800
		
		
		//System.out.println(ar.get(8)); //IndexOutOfBoundsException
		//System.out.println(ar.get(-1)); //ArrayIndexOutOfBoundsException
		
		//print all values from arraylist
		System.out.println("..........print all values from array list..............");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
//ArrayList with Generic - Generic in ArrayList will allow to hold similar kind of data(in other words generic in ArrayList restricts data types
		
		//integer data types arraylist
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(35);
		marks.add(45);
		marks.add(95);
		
		System.out.println("......print marks......");
		
		for (Integer m : marks) {
			System.out.println(m);
			
		}
		System.out.println("..................");
		for(int m : marks) {
			System.out.println(m);
		}
		//double ArrayList
		ArrayList<Double> avg = new ArrayList<Double>();
		
		avg.add(15.33);
		
		//String ArrayList
		ArrayList<String> sName=new ArrayList<String>();
		sName.add("Mahi");
		sName.add("Karthi");
		sName.add("Pallavi");
		sName.add("Suri");
		sName.add("Ravi");
		//for each (enhanced for loop)
		System.out.println(".......print Student Names");
		int cnt = 0;
		for (String s : sName) {
			System.out.println(s+ " "+"Index of: "+cnt);
			if(s.equals("Mahi")) {
				System.out.println("Avag Student");
			}
			else if(s.equals("Karthi")) {
				System.out.println("Brilliant Student");
			}
			else if (s.equals("Pallavi")) {
				System.out.println("100% attendance");
			}
			else if(s.equals("Suri")) {
				System.out.println("Movie Director");
			}
			else if(s.equals("Ravi")) {
				System.out.println("Branch Manager");
			}
			cnt++;
		}
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Karthika");
		empData.add(211475);
		empData.add(20.50);
		empData.add(true);
		System.out.println("..........print emp data................");
		
		for (int i=0;i<empData.size();i++) {
			System.out.println(empData.get(i));
		}
		
		//using for each
		
		for (Object o : empData) {
			System.out.println(o);
			
		}
		
		
		

	}

}
