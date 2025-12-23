package Day1;

public class Student {
 String name;  //class variables
 int age;
 char grade;
 
 void printStudentData() //No parameter no return value
 {
	 System.out.println(name+ " "+age+" "+" "+grade);
 }
 void setStudentData(int Sage, String Sname, char Sgrade) //takes parameter, no return value
	{
	 name=Sname;
	 age=Sage;
	 grade=Sgrade;
 }
}
