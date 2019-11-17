package day28;

public class ExcelVisula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]data = {{2,14,3},{4,5},{9,7}};
		
		
		//2ND Way
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data[i].length; j++) {
				System.out.print("dataa[" + (i)+ "]["+j+"] = "+data[i][j]);
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
