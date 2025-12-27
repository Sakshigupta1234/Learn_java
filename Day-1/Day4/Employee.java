package Day4;

public class Employee {

	//Variables
	int id; //Class level variables
	String ename;
	int age;
	String role;
	
	
	//Methods
void Display()
	{
		System.out.println(id);
		System.out.println(ename);
		System.out.println(age);
	}
	 //we can't create another method inside method that's why we have not added Display() inside main()
	//Only variables we can declare inside main().
	public static void main(String[] args) //without main class we ca't run this class file only we can compile but not run it will through error
	{
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.id=10;
		e.ename="Saurabh";
		e.age=25;
		e.role="Engineer";
		e.Display();

	}

}
