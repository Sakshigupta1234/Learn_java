package Day6;

public class StringComparison {

	public static void main(String[] args) {
		// Comparison using == , equals()
		
		
		//Case1
		String s1="Welcome";
		String s2="Welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//Case2
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		System.out.println(s3==s4); //false  
		System.out.println(s3.equals(s4)); //true
		
//		why line 18 returns false because
//		== compares the objects
//		equals() compares the value of objects

		//Case3
		String s5="Welcome";
		String s6=new String("Welcome");
		System.out.println(s5==s6); //false
		System.out.println(s5.equals(s6)); //true
		
		//How objects will be equal?
		//Case4
		String s7="Welcome";
		String s8=new String("Welcome");
		String s9=s8;
		System.out.println(s7==s8); //false
		System.out.println(s7.equals(s8)); //true
		System.out.println(s8.equals(s9)); //true
	}

}
