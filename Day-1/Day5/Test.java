package Day5;

import java.util.Arrays;

public class Test {

	/*String -- set of characters & it is predefined class.
	
	String Methods- we can perform different type of operation on strings.
	1) Built in  - Java already those methods & we have to just use those methods.
	2)User Defined/Custom methods
	
	*/
	public static void main(String[] args) {
		
	//There are 2 ways to declare String variable
	
		
	String s="Welcome"; // 1st way is where String is Class & s is a variable
	
	String str=new String("Welcome"); //2nd way 
	
	//DIfference between these two ways & it will save in memory in different way
	
	
	
	//length() - return length of String
	s.length();
	System.out.println(s.length()); //7
	int len=s.length();
	System.out.println(len);//7
	System.out.println("welcome".length()); //7
	
	
	//concat() - joining strings
	String s1="Welcome";
	String s2="to java";
	String s3="Automation";
	System.out.println(s1.concat(s2)); //Welcometo java
	System.out.println(s1+s2); //Welcometo java
	
	//If you have a multiple strings to concatenating
	System.out.println(s1+s2+s3); //Welcometo javaAutomation
	System.out.println(s1.concat(s2).concat(s3)); //Welcometo javaAutomation
	System.out.println(s1.concat(s2+s3)); //Welcometo javaAutomation
	
	//without variables, we also concat the strings
	System.out.println("Welcome"+"to java"); //Welcometo java
	System.out.println("Welcome".concat("to java")); //Welcometo java
	
	
	//trim = remove spaces right & left side
	String s4="   Welcome   ";
	System.out.println("Before trimming"+s4.length()); //13 String will store white-spaces as well
	System.out.println(s.trim()); ////Welcome
	System.out.println("After Trimming"+s.trim().length());//7
	
	//charAt() - returns a character from a string based on index
	//index starts from 0
	String s5="Welcome";
	System.out.println(s5.charAt(0)); //W
	System.out.println(s5.charAt(3)); //c
	
	//Contains -  it returns boolean value true/false & String is case sensitive, 
	//as you know  String s1="Welcome";
	String s6="We";
	System.out.println(s1.contains(s6)); //True  , contains() will check s2 string is there under s1 or not
	System.out.println(s1.contains("we")); //False
	
	//position is not imp but sequence should be same
	String s7="come";
	System.out.println(s1.contains(s7)); //true
	System.out.println(s1.contains("welcme")); //false
	
	
	//equals()  equalsIgnoreCase()  - compare Strings
	String s8="welcome";
	System.out.println(s1.equals(s2)); //false
	System.out.println(s1==s2); //true
	
	
	//Difference between '==' & equals()
	
	//equals() method will consider case- sensivity & '==' operator doesn't consider Case sensivity
	System.out.println(s1.equals("Welcome")); //True
	System.out.println(s1.equals("welcome")); //False
	System.out.println(s1.equalsIgnoreCase("welcome"));//True
	
	
	//replace() - replace single/multiple(sequence) of characters in a string
	String s9="Welcome to Selenium java Selenium Python Selenium C#";
	System.out.println(s9.replace('e','x')); //Wxlcomx to Sxlxnium java Sxlxnium Python Sxlxnium C#
	System.out.println(s9.replace("Selenium","Playwright")); //Welcome to Playwright java Playwright Python Playwright C#
	System.out.println(s9.replace("selenium","Playwright")); //Welcome to Selenium java Selenium Python Selenium C#
 
	
	//i observed one thing , replace() is also case sensitive, you can check the above ex.
	
	//substring()- extract some portion/substring from the main StringA
	//Starting index 0
	//ending index -1
	String s10="Selenium";
	System.out.println(s10.substring(1,5)); //elen
	System.out.println(s10.substring(0,3));//Sel
	
	//toUpperCase()
	System.out.println("sakshi".toUpperCase()); //SAKSHI
	
	//toLowerCase()
	System.out.println("SaksHI".toLowerCase()); //sakshi
	
	//split()- split the string into multiple parts based on delimeter
	s1="sak0123@gmail.com";
	//here delimeter are @ .
	String a[]=s1.split("@"); //because split() return array , we can not directly print
	
	System.out.println(Arrays.toString(a)); //[sak0123, gmail.com]
	System.out.println(a[0]); //sak0123
	System.out.println(a[1]); //@gmail.com
	
	//Example1
	s1="$51,52,53"; //expected 515253 how you will achieve
	System.out.println(s1.replace("$","").replace(",","")); //515253
	
}
}
