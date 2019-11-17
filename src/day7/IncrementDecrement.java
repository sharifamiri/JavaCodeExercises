package day7;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		/*
		int b = 10;
		
		System.out.println(b++);
		System.out.println(b);
		
		System.out.println(++b);
		System.out.println(b);
		*/
		
		//increment ---- incresing value by one ++ ex. b++  ++b
		// decrement --- decreasing value by one -- ex. b--  --b
		
		// if ++ comes after variable name ---> post increment
			//it means increase the and only reflect the change next time
			//the variable showed up again
		
		// if ++ comes before variable name ---> pre increment
		//it means increase the value right away and reflect the change right away
	
		int x = 3;
		
		// x = x++; //it will be reflected when we see it next time, still x=3
		// System.out.println(x);
		
		//x = ++x; //it will be reflect right away, x=4
	
		
		//int result = x++ + 5; //3+5
		//int result = ++x + 5; //4+5
		
		//x = x++ + ++x; //x++=3, then 3+(next time 4 +1), that's why 3+5=8
		
		x = x++ + --x + x-- + x; //3+(4-1)+3+(3-1)=11
				
		//System.out.println(result); 
		System.out.println(x);
		
		//x++; //x++;  //if I change this to pre-increment, 
		//System.out.println(x);
		
		//System.out.println(x++);
		//System.out.println(x);
		
		//System.out.println(x); //no change in here
		//System.out.println(x);
		
		//System.out.println(x--); //post-decrement
		//System.out.println(x);
		
		// System.out.println(--x); //pre-decrement
		// System.out.println(x);
		
	}

}
