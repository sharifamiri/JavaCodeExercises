package day40;

public class ComputerFactory {

	public static void main(String[] args) {
	
		Computer iMac = new Computer();
		Computer MacBookPro = new Computer();
		Computer dell = new Computer();
		
		System.out.println(iMac==MacBookPro);//false -->two different objects
		System.out.println("--------IMAC--------");
		
		iMac.color = "silver";
		System.out.println(iMac.type);
		
		iMac.type = "IMAC 27";
		System.out.println(iMac.type);
		
		System.out.println(iMac.OS);
		System.out.println(iMac.isPersonal);
		iMac.OS = "macOS Mojave";
		
		iMac.isPersonal = true;
		iMac.ram = 16;
		
		System.out.println(iMac.OS);
		System.out.println(iMac.isPersonal);
		System.out.println("**************");
		iMac.printInfo();
		
		dell.printInfo();
		dell.color = "Balck";
		dell.OS="Windows 10";
		dell.ram = 32;
		dell.type="Dell XPS";
		dell.screenSize = 15;
		//Printing after setting all values
		dell.printInfo();
				
		

	}

}
