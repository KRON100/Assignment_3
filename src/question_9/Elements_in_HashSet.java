package question_9;

import java.util.HashSet;

public class Elements_in_HashSet {

	public static void main(String[] args) {
		
		//	Write a Java program to get the number of elements in a hash set.

		HashSet<Integer> in = new HashSet<Integer>();
		in.add(10);
		in.add(20);
		in.add(30);
		in.add(40);
		in.add(50);
		in.add(60);
		in.add(70);
		in.forEach((k) -> {
			System.out.println(k);
			});
	}

}
