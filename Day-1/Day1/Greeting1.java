package Day1;

public class Greeting1 {
public static void main(String[] args) {
    Greeting x=new Greeting(); //we are calling m1() METHOD using object x .
    x.m1(); //1
   
    
    // x.m2(); //If you will run , it will not show output because it is returning string value so for now it hold the value
    String s=x.m2();// it will save the value in the variable
    System.out.println(s);
    
    x.m3("Sakshi"); //3
    
    
   String s1= x.m4("Sakshi"); //4
   System.out.println(s1);
}
}
