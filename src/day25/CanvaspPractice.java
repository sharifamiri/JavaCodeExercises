package day25;

import java.util.Arrays;

public class CanvaspPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// use above two array to generate below messages 
		  // The course id for <Welcome Kit> is <143>  
		  
		//  for(int i=0; i<courses.length;i++)
		 //   System.out.println(" The course id for <"+courses[i]+"> is <"+courseId[i]+">");
		//  
		  // find out the ID of online Java Programming course 
		
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 
	
	for (int i = 0; i < courseId.length; i++) {
		System.out.println("The course ID for <"+courses[i]+"> is <" + courseId[i]+">");
		//System.out.println(Arrays.toString(courses) + "<"+courses[i]+"> is <" + courseId[i]+">");
		}
	
		for (int j = 0; j < courses.length; j++) {
			String eachCourse = courses[j];
			if(eachCourse.equals("Online-Java Programming")) {
				System.out.println("INDEX IS: "+courseId[j]);
				break;
			}
			}
		
		
			for (int j = 0; j < courseId.length; j++) {
				
				if(courseId[j]==203) {
					System.out.println("203 Course Name IS: "+courses[j]);
					break;
				}
				}
			
			int count = 0;
			for (int i = 0; i < courseId.length; i++) {
				if(courses[i].contains("Software")) {
					count++;
				}
			}
			System.out.println("Number of Courses that Contain Software: " + count);

}
}