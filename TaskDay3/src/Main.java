
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Aslınaz", "Atabay", "atabayaslinaz@gmail.com", "123456");
		
		UserManager userManager1 = new UserManager();
		userManager1.addUser("Aslınaz");
		userManager1.arrangeUser("Aslınaz");
		userManager1.deleteUser("Aslınaz");
		
		System.out.println(user1.getFirstName() + " isimli kullanıcının işlemleri tamamlandı.");
		System.out.println("   ");
		
		
		
		Student student1 = new Student(1, "Aslınaz", "Atabay", "atabayaslinaz@gmail.com", "123456", "İstanbul", 21);
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.addStudent("Aslınaz");
		studentManager1.arrangeStudent("Aslınaz");
		studentManager1.deleteStudent("Aslınaz");
		
		
		System.out.println("   ");
		
		
		Instructor instructor1 = new Instructor(1, "Aslınaz", "Atabay", "atabayaslinaz@gmail.com", "123456", 1);
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.addInstructor("Aslınaz");
		instructorManager1.arrangeInstructor("Aslınaz");
		instructorManager1.deleteInstructor("Aslınaz");
		
		

		
		
		
	}

}
