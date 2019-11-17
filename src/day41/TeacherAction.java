package day41;

public class TeacherAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher akbar = new Teacher();
		//fields are private we can not access
		
		akbar.setName("Akbar");
		akbar.setSpecialty("magic");
		//System.out.println(akbar.name);
		//System.out.println(akbar.speciality);
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		
		
	}

}
