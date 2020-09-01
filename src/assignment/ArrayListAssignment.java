package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {
//1. Write a Java program to create a new array list, add some colours (string) and print out the collection
		
		ArrayList<String> cName = new ArrayList<String>();
			cName.add("Violet");
			cName.add("Indigo");
			cName.add("Blue");
			cName.add("Green");
			cName.add("Yellow");
			cName.add("Orange");
			cName.add("Red");
			System.out.println("......Program 1 ...Colors Name...............");
			//System.out.println(cName);
		for(String s : cName) {
			System.out.println(s);
		}
		
//2. Write a Java program to insert an element into the array list at the first and last positions.
		ArrayList<Integer> ele = new ArrayList<Integer>();
			ele.add(10);
			ele.add(20);
			ele.add(30);
			System.out.println("........Program 2 ....Before Insert....");
			System.out.println(ele);
			ele.add(0, 111);
			ele.add(4,222);
			System.out.println("....After Insert..........");
			for (Integer num : ele) {
				System.out.println(num);
			}
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
			System.out.println(".........Program 3...@specific index........");
			System.out.println(ele.get(4)); //222
		
//4. Write a Java program to update specific array element by given element.
			System.out.println(".......Program 4....update specific array element..............");
			ele.set(3, 333);
			System.out.println(ele.get(3));
			
//5. Write a Java program to remove the third element from a array list. 
			ArrayList<String> names = new ArrayList<String>();
				names.add("Java");
				names.add("Python");
				names.add("Ruby");
				names.add("C#");
				names.add("Pearl");
				System.out.println(".......Program 5.....Before remove......\n");
				System.out.println(names+"\n");
				System.out.println("....After remove..........\n");
				names.remove(2);
				for(String str : names)
				{
					System.out.println(str);
				}
		
//6. Write a Java program to search an element in a array list.
				System.out.println("....Program 6.......Search an Element.......");
				System.out.println(names.contains("Java")); // true
//7. Write a Java program to reverse elements in a array list
				ArrayList<String> Icity = new ArrayList<String>();
					Icity.add("Delhi");
					Icity.add("Mumbai");
					Icity.add("Hyderabad");
					Icity.add("Simla");
					Icity.add("Ladakh");
				System.out.println("......Program 7....Befor reverse elements.....\n");
				for (String name : Icity)
				{
					System.out.println(name);
				}
				System.out.println("......After Reverse Elements....\n");
				for (int a=Icity.size()-1; a>=0; a--) {
					System.out.println(Icity.get(a));
				}
//8. Write a Java program to extract a portion of a array list.					
		System.out.println("...Program 8....Extract a portion.....\n");
		System.out.println(Icity.subList(1, 3));
//9. Write a Java program of swap two elements in an array list.
		System.out.println("....Program 9.....Before swap....");
		for(String s : Icity) {
			System.out.println(s);
		}
		System.out.println("....After Swap....0 & 4 index....");
		Collections.swap(Icity,0,4);
		for(String s : Icity) {
			System.out.println(s);
		}
//10. Write a Java program to empty an array list.
		ArrayList<Character> ar = new ArrayList<Character>();
			ar.add('I');
			ar.add('N');
			ar.add('D');
			System.out.println("...Program 10...Before empty arraylist....");
			System.out.println(ar);
			System.out.println("...After empty...ArrayList....");
			ar.clear();
			System.out.println(ar);
			System.out.println("Size of array after empty is: "+ar.size()); //0
			
//11. Write a Java program to trim the virtual capacity of an array list the current list size.	
			System.out.println("\n....Program 11....Befor Trim...");
			System.out.println(Icity);
			Icity.trimToSize(); //Trims the capacity of this ArrayList instance to be the list's current size.
			System.out.println("....After Trim.....");
			System.out.println(Icity);
			/*
			 * Icity.add("Banglore"); System.out.println(Icity);
			 */
//12.Write a Java program to print all the elements of a ArrayList using the position of the elements
			
			ArrayList<String> cricketer = new ArrayList<String>();
			cricketer.add("Sachin");
			cricketer.add("Sourav");
			cricketer.add("Dravid");
			cricketer.add("Lakshman");
			cricketer.add("Mahendra");
			cricketer.add("Yuvi");
			
			int cnt = cricketer.size();
			System.out.println("\n....Program 12.....Based on Index....");
			System.out.println(cnt);
			for (int c = 0; c<cnt; c++) {
				System.out.println("@Index Position "+c+" is: "+cricketer.get(c));
			}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
