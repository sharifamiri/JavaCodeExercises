package day65;

import java.util.*;

public class IteratingElements {

  public static void main(String[] args) {

    Collection<Integer> nums = new ArrayList<>();    
    nums.add(1);
    nums.add(3);
    nums.add(5);
    nums.add(10);
    nums.add(32);
    nums.add(51);
//    for (Integer each : nums) {
//      System.out.println( "each : " + each);
//      if(each>10) {
//        nums.remove(each) ; 
//      }
//    }
    
    System.out.println(nums);

  //   [1, 3, 5, 10, 32, 51]
    
    // creating Iterator instance by calling  iterator() method 
     Iterator<Integer> myIter = nums.iterator(); 
     
     System.out.println("myIter.hasNext() " +  myIter.hasNext()  );
     
     while( myIter.hasNext() ) {
       
       Integer each = myIter.next(); 
       System.out.println(  each );
      
       if( each > 9) {
         myIter.remove();
       }
       
     }
     System.out.println( nums  );
     
     //System.out.println("myIter.next() " +  myIter.next()  );
     
//     System.out.println("myIter.next() " +  myIter.next()  );
//     System.out.println("myIter.next() " +  myIter.next()  );
//     System.out.println("myIter.next() " +  myIter.next()  );
////     System.out.println("myIter.next() " +  myIter.next()  );
////     System.out.println("myIter.next() " +  myIter.next()  );
////     System.out.println("myIter.next() " +  myIter.next()  );
//     
//     System.out.println("myIter.hasNext() " +  myIter.hasNext()  );
//     System.out.println("myIter.next() " +  myIter.next()  );
//     
//     myIter.remove();
     
    //System.out.println( myIter  );
     
     //System.out.println( nums  );
     
     Collection<Integer> num2 = new ArrayList<>(Arrays.asList(1,5,10,15));
     
     System.out.println(num2);
     
     Iterator<Integer> iter = num2.iterator();
     while(iter.hasNext()){
    	 Integer each2 = iter.next();
    	 if(each2>10) {
    		 iter.remove();
    	 }
     }
     
     System.out.println(num2);
    
  }

}

