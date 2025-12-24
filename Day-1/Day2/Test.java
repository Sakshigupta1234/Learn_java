package Day2;

public class Test {
 
	int id;
	String name;
	// Constructor - It's look like same as method but constructor is having same name as its class name & 
	//constructor doesn't have any return type not void as well
	Test() //Default Constructor
	{
		id=01;
		name="Sonu";
	}
	
	Test(int Sid, String Sname)//Parameterized constructor
	{
		id=Sid;
		name=Sname;
		
	}
	void PrintData() {
		System.out.println(name +" "+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
Test t1=new Test(2, "Sakshi");
t.PrintData();
t1.PrintData();
	}
	
	/*Methods vs Constructor
	1) Constructor syntax is same as method but constructor name should be same as class name but method name can be anything
	2) Constructor doesn't return any value but method may or may not return any value
	3) We don't specify void
	3)In the method we can write anything, loop logic but in Constructor , we can just initialize the data
	 (we can only assigning the data to the variables nothing else)
	 4)Constructor automatically invoke at the time of object creation
	 5) Used for initializing the value of the variables
	*/
}
