package Day6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We have two more classes in java similar as in String Type class
 //StringBuilder & StringBuffer
		
		//Ex. Way to Declare a string
		String S=new String("Welcome");
		
		//Similarly we can declare a StringBuilder/Buffer variable
		StringBuffer S1=new StringBuffer("Welcome");
		StringBuilder S2=new StringBuilder("Welcome");
		
		//For Reverse a String using StringBuffer
		StringBuffer S3=new StringBuffer("Welcome");
//StringBuffer s4="Welcome"; //throw error as string can't convert to StringBuffer
		StringBuilder s4=new StringBuilder("Welcome");
//Now, do reverse
System.out.println(S3.reverse()); //reverse() method is under StringBuffer class
System.out.println(s4.reverse()); //reverse() method is under StringBuilder class


	
	}

}
