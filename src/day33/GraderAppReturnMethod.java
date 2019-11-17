package day33;

public class GraderAppReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gradeTheScore(89));
		System.out.println(gradeTheScore(99));
		System.out.println(gradeTheScore(69));
		System.out.println(gradeTheScore(40));
		
	}
	
	public static char gradeTheScore(int score) {
		
		if(score<=100 && score>=90) return 'A';
		if(score<=89 && score>=80) return 'B';
		if(score<=79 && score>=70) return 'C';
		if(score<=69 && score>=60) return 'D';
		
		return 'F';
//		if(score<=100 && score>=90) {
//			return 'A';
//		}else if(score<=89 && score>=80) {
//			return 'B';
//		}else if(score<=79 && score>=70) {
//			return 'C';
//		}else if(score<=69 && score>=60) {
//			return 'D';
//		}else {
//			return 'F';
//		}
	}

}
