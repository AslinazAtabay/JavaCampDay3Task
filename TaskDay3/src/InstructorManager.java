
public class InstructorManager extends UserManager {
	
	public void addInstructor(String instructor) {
		
		System.out.println(instructor + " isimli eğitmen eklendi.");
	}
	
	public void deleteInstructor(String instructor) {
		System.out.println(instructor + " isimli eğitmen silindi.");
	}
	
	public void arrangeInstructor(String instructor) {
		System.out.println(instructor + " isimli eğitmenin bilgilerini düzenliyorsunuz.");
	}

}
