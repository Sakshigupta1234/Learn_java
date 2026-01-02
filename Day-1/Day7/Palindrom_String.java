package Day7;

public class Palindrom_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "radar";
		String rev="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//			
//		}
		
		//2nd way without using String methods
//		char a[]=str.toCharArray();
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
		
		//3rd way
		//using StringBuilder
//		StringBuilder str1=new StringBuilder("Welcome");
//		String rev1=str1.reverse().toString();
		System.out.println(rev);
		if(rev.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}
	}
	

}
