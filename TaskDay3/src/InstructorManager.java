
public class InstructorManager extends UserManager {
	
	public void addInstructor(String instructor) {
		
		System.out.println(instructor + " isimli e�itmen eklendi.");
	}
	
	public void deleteInstructor(String instructor) {
		System.out.println(instructor + " isimli e�itmen silindi.");
	}
	
	public void arrangeInstructor(String instructor) {
		System.out.println(instructor + " isimli e�itmenin bilgilerini d�zenliyorsunuz.");
	}

}
