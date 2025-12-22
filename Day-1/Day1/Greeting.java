package Day1;
public class Greeting {

    //Method - Set of statements or group of code to perform a certain task

    /*
    Why you need to create a method? -
    Suppose, you want to do some task repetitively, so instead of writing same code a2a we'll create a method
    & whenever you want to perform a task, we will just call that method & that method will perform the job
    
    *** We have to call the methods through object..

    Types of methods:
    -->Built in methods ->Already exist in java we have to just call them whenever it's required..
    -->User defined methods-> We can create our own methods based on our requirements


    There are 4 ways to create a methods

    No Parameters No return value
    No Parameters  but return value
   Takes Parameters but return value
    Takes Parameter but no return value
    */

 
	//1. No parameter with no return value
    //Note*- if method is not returning any value so, we have to specify return value as 'void' otherwise it shwos error..
      void m1(){
        System.out.println("hey");
      }
      
      
      //2. No Parameters  but return value
       String m2() {
        	return("Hello, How are you?");//it is returning some value . So, instead of void return type string as we are returning string value
        }
       
       //3.    Takes Parameters but no return value
       void m3(String name) { //No return value i.e. return type should be void
    	   System.out.println("My name is "+name);
       }
    
       //4.    Takes Parameters but return value
       String m4(String name) {
    	   return("Hello "+name);
       }
}

