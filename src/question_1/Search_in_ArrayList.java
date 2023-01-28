package question_1;

import java.util.ArrayList;

public class Search_in_ArrayList {

	public static void main(String[] args) {
		
		// Write a Java program to search an element in a array list.
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		Integer n = 50;
		 for (int i = 0 ;i<in.size();i++) {
			 if ( n == in.get(i)) {
				 System.out.println("Element found at " + i + " index");
			 }
		 }

	}

}
