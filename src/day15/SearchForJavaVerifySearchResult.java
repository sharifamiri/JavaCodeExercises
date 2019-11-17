package day15;

public class SearchForJavaVerifySearchResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//About 813,000,000 results (0.56 seconds)
		//store above String and validate
		//it starts with word About, and it contains word result
		
		String str = "about 813,000,000 results (0.56 seconds)";
		
		//how to get certain part of String?
		
		
//		if(str.indexOf("About")==0) {
//			System.out.println("it started with About");
//		}else {
//			System.out.println("it did not start with About");
//		}
//		
//		if(str.indexOf("results")>=0) {
//			System.out.println("it contains results");
//		}else{
//			System.out.println("no result");
//		}
//		
         //if(str.indexOf("About")==0) {
		if(!str.substring(0,5).equals("About")) {
			System.out.println("About did not start in the beggining");
		}else if(!str.contains("results")) {
			System.out.println("Does not contains word results");
		}
		
		System.out.println("it fails");
		
		}

}
