package Day6;

public class StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {

		//String - Immutable
				String s=new String("welcome");
				s.concat("to java");
				System.out.println(s); //welcome
				//System.out.println(s.concat("to java")); //welcometo java
				
				
		//StringBuffer - Mutable , we can change original value
				StringBuffer s1=new StringBuffer("welcome");
				s1.append("to java");
				System.out.println(s1); //welcometo java
				
				//StringBuilder - Mutable , we can change original value
				StringBuilder s2=new StringBuilder("welcome");
				s2.append("to java");
				System.out.println(s2); //welcometo java
				
		//Note*- StringBuilder &StringBuffer is almost same
		//in String, for concatenation we have concat() but in StringBuilder &StringBuffer, we have append() for concatenation
				
	}

}
