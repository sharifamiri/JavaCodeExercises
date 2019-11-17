package day28;

public class TwoDArrayThirdWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {1,23,4};
		
		int [][]data = {{2,14,3},{4,5},{9,7}};
		
		//1ST Way
		for (int[] eachRow : data) {
			
			for (int eachColumn : eachRow) {
				System.out.print(eachColumn+" ");
			}
			System.out.println();
		}
		
		//2ND Way
		for (int i = 0; i < data.length; i++) {
			System.out.print("Row number: "+ (i+1)+ " : ");
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
