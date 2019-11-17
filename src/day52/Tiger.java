package day52;

import day52.sub.Animals;


class class1 {

	String name = "Cybertek";
	
	void method1() {
		
	}
}

public class Tiger extends Animals{ // extends class1{
	public void methods2() {
		//System.out.println(name);
		Tiger obj = new Tiger();
		
		System.out.println(obj.protectedstr);
		
		
		
		Animals obj2 = new Animals();
		//we can not access parent class's protected field 
			//through parent class object
		//System.out.println(obj2.protectedstr); //gives compile error
	}
}
