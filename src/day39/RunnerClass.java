package day39;

public class RunnerClass {

	  public static void main(String[] args) {
	    
	    // local variable  
	    //String s = "abc" ; 
	    
		//Creating new person object
	    Person p1 = new Person(); 
	    //setting attributes value of object
	    p1.name = "Talmurat" ;
	    p1.age = 1 ;
	    p1.gender = 'M' ; 
	    
	    System.out.println(p1.age);
	    
	    Person p2 = new Person(); 
	    p2.name = "Dianna" ;
	    p2.age = 28 ;
	    p2.gender = 'F' ; 
	    
	    System.out.println(p1.age);
	    
	    Horse spartan = new Horse();
//	    spartan.breed = "cyber";
//	    spartan.age = 10;
//	    spartan.color = "brown";
//	    spartan.height = 7.3;
	    
	    System.out.println(spartan.breed);
	    
	    
	  }

	}
