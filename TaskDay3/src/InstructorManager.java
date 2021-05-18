
public class InstructorManager extends UserManager {
	
	public void addInstructor(String instructor) {
		
		System.out.println(instructor + " isimli eðitmen eklendi.");
	}
	
	public void deleteInstructor(String instructor) {
		System.out.println(instructor + " isimli eðitmen silindi.");
	}
	
	public void arrangeInstructor(String instructor) {
		System.out.println(instructor + " isimli eðitmenin bilgilerini düzenliyorsunuz.");
	}

}
