
public class StudentManager extends UserManager {
	
	public void addStudent(String student) {
		System.out.println(student + " isimli öğrenci eklendi.");
	}
	
	public void deleteStudent(String student) {
		System.out.println(student + " isimli öğrenci silindi.");
	}
	
	public void arrangeStudent(String student) {
		System.out.println(student + " isimli öğrencinin bilgilerini düzenliyorsunuz.");
	}
	

}
