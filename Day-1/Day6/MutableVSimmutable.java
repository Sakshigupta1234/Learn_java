package Day6;

import java.util.Arrays;

public class MutableVSimmutable {

	public static void main(String[] args) {
		
		//immutable - can't change
		//mutable - can change
		
		//Immutable
		String s=new String("welcome");
		s.concat("to java");
		System.out.println(s); //welcome
		System.out.println(s.concat("to java")); //welcometo java
		
		/*s.concat("to java");  
		The concat() method does not modify the original string because String in Java is immutable.
		It returns a new string "welcometo java", but since you didn’t assign it to a variable, that result is discarded.

		System.out.println(s);  
		Prints the original string "welcome" because s was never changed.

		System.out.println(s.concat("to java"));  
		Prints the new string "welcometo java" because here you are directly printing the result of concat().
		*/
		
		
		
		//mutable
		int a[]= {10,6,3,15,3};
		System.out.println(Arrays.toString(a));//[10, 6, 3, 15, 3]
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));//[3, 3, 6, 10, 15]
	}

}
