package day40;

public class PhoneFactory {
	public static void main(String[] args) {
		Phone iphone = new Phone();

		// how we are accessing instance fields
		// or instance variables
		// object - it's an instance of class
		// in this case, iphone it's an object of Phone class
		// we are defining values of instance variables
		// only for this particular object
		iphone.brand = "Apple";
		iphone.model = "Iphone XS";
		iphone.OS = "IOS";
		iphone.color = "Rose Gold";
		iphone.storageSize = 256;
		iphone.isWaterResistant = true;
		iphone.screenSize = 5.8;
		iphone.ram = 3;
		iphone.camera = 12;
		iphone.price = 999.99;
		iphone.supports5G = false;
		iphone.cpu = "Apple Bionic A13";
		iphone.imei = 990000862471854L;
		// no let's check what this iphone has
		System.out.println(iphone.brand);
		// it will display this message:Phone is ringing
		iphone.ring();
		iphone.call();
		iphone.sendSMS("Hello World!", 5718930234L);
		iphone.dial(5718930234L);
		iphone.printInfo();
		System.out.println("*************");
		
		//2ND NEW OBJECT
		//here we have created one more object of Phone class
		//samsung - it's a name of new object
		Phone samsung = new Phone();
		samsung.brand = "Samsung";
		samsung.model = "Galaxy s10 5G";
		samsung.color = "purple";
		samsung.storageSize = 256;
		samsung.isWaterResistant = true;
		samsung.screenSize = 5.8;
		samsung.ram = 3;
		samsung.camera = 12;
		samsung.price = 989.99;
		samsung.supports5G = false;
		samsung.ring();
		samsung.call();
		samsung.sendSMS("How are you!", 3124125096L);
		samsung.dial(3124125096L);
		samsung.printInfo();
		System.out.println("********");
		//here we have created one more object of Phone class
		//samsung - it's a name of new object
		Phone google = new Phone();
		google.brand = "Google";
		google.model = "Pixel 3";
		google.price = 235d;
		google.color = "purple";
		google.storageSize = 256;
		google.isWaterResistant = true;
		google.screenSize = 5.8;
		google.ram = 3;
		google.camera = 12;
		google.price = 989.99;
		google.supports5G = false;
		google.ring();
		google.call();
		google.sendSMS("How are you!", 3124125096L);
		google.dial(3124125096L);
		google.printInfo();
		
		System.out.println(google.brand);

		
		
	}

	// add you own methods to the Phone class
	// I cannot do like this: Phone.ring();
	// It's not valid, because it's not a static method
	// I have to create an object, before accessing these methods
	// and instance fields
	// static methods, variables -> belong to class
}
