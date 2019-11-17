package day39;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lineLst = getTextFileAsList("hero.txt");
		System.out.println(lineLst);
		
//		String fullPath = "/Users/sharifamiri/eclipse-workspace/Spring2019_Project1/src/day39/List.txt";
//		List<String> lineLst2 = getTextFileAsList(fullPath);
//		System.out.println(lineLst2);
		
		
		System.out.println(lineLst.size());
		
		//xls  doc  ppt  pdf
		String s = "erat_quisque_erat.xls";
		//how to find file extension
		String fileExtention = s.substring(s.indexOf(".")+1);
		System.out.println(fileExtention);
		
		int xlsCount=0;
		for (String each : lineLst) {
			System.out.println(each);
//			String fileExt = each.substring(each.indexOf(".")+1);
//			if(fileExt.equals("xls")) {
//				xlsCount++;
//			}
			if(each.endsWith(".xls")) {
				xlsCount++;
		}
		}
		System.out.println("Excel Count file is: " + xlsCount);
		
		String longest = lineLst.get(0);
		for (String each : lineLst) {
			if(each.length()>longest.length()) {
				longest = each;
			}
		}
		System.out.println("Longest file name: " + longest);
		
		//Finding longest excel file name
		String longestExcel = "";
		for (String each : lineLst) {
			if(each.endsWith(".xls") && each.length()>longestExcel.length()) {
				longestExcel=each;
			}
		}
		System.out.println(longestExcel);
	}
	/*
	 * DO NOT MODIFY AND JUST USE IT
	 * Method name : getTextFileAsList
	 * @parameter  location of text file as String
	 * 	if your file is at root path (right under project folder)
	 *  you may directly path your filename.txt
	 *  if not pass /your/own/folder/name/filename.txt as String to method
	 * 
	 * @return List of String that contain each line as per element

	 */
	public static List<String> getTextFileAsList(String filePath) {

		List<String> allLines = null;
		try {
			allLines = Files.readAllLines(Paths.get(filePath));
		} catch (Exception e) {
			System.out.println("Wrong file path probably");
		}
		return allLines;

	}
}