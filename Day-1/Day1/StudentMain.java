package Day1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Student s2=new Student();

//1) using object reference variables we are calling the method)

/*s2.name="Sakshi"; 
s2.age=25;
s2.grade='A'; 
s2.printStudentData(); */  


//2) using other method
//s2.setStudentData(18,"Sakshi",'A');
//s2.printStudentData();

//3) using constructor
		Student s3=new Student(18,"Sakshi",'A');
		s3.printStudentData();

	}

}
