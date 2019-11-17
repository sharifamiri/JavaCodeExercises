package day28;

import java.util.Arrays;

public class WarmUp2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] table = new int[4][2];
	    table[0][0] = 12;
	    table[0][1] = 17;
	    table[1][0] = 3;
	    table[1][1] = 40;
	    table[2][0] = 44;
	    table[2][1] = 27;
	    table[3][0] = 23;
	    table[3][1] = 12;


	    //1ST WAY
//	    for (int[] eachRow : table ) {
//			for (int eachCell : eachRow) {
//				System.out.print(eachCell+ " ");
//			}
//			System.out.println();
//		}
//	    System.out.println();
		
	    
	    //2ND WAY
	    String store = "";
	    for (int i = 0; i < table.length; i++) {
	    //int [] eachRow = table[i];
		//store = Arrays.deepToString(table);
	    
	    for (int j = 0; j < table[i].length; j++) {
	    	//for (int j = 0; j < eachRow.length; j++) {
			System.out.print(table[i][j]+" ");
		}
	    System.out.println();
		}
	    
	    //System.out.println(store);
	    
	    
	    
	    
	}

}
