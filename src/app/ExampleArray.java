package app;

import java.util.ArrayList;
import java.util.List;

public class ExampleArray {
	
	public static void main(String args[]) {
		//array
		String name ="";
		String[] names ={"juan","pedro"};
		
		int number =0;
		int[] numbers = new int[4];
		//int[] numbers = {1,2,3};
		
		
		//ArrayList
		//generic
		ArrayList myList = new ArrayList();
		myList.add(1);
		myList.add("sample");
		
		ArrayList<Integer> myNumberList = new ArrayList<Integer>();
		myNumberList.add(1);
		myNumberList.add(2);
		
		myNumberList.remove(0);
		
		//System.out.println(myNumberList.size());
		
		//ArrayList of object
		//object is Person
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("azer"));
		
		Person jerson = new Person();
		jerson.setName("jerson");
		personList.add(jerson);
		
		//first way
		for(int x =0; x <personList.size();x++) {
			System.out.println(personList.get(x).getName());
		}
		
		
		//second way
//		for(Person p: personList) {
//			System.out.println(p.getName());
//		}
//		
//		//hard way
//		int x =0;
//		while(x <personList.size()) {
//			System.out.println(personList.get(x).getName());
//			x++;
//		}
	}
	
}
