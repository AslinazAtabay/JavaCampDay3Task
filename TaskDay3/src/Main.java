
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Asl�naz", "Atabay", "atabayaslinaz@gmail.com", "123456");
		
		UserManager userManager1 = new UserManager();
		userManager1.addUser("Asl�naz");
		userManager1.arrangeUser("Asl�naz");
		userManager1.deleteUser("Asl�naz");
		
		System.out.println(user1.getFirstName() + " isimli kullan�c�n�n i�lemleri tamamland�.");
		System.out.println("   ");
		
		
		
		Student student1 = new Student(1, "Asl�naz", "Atabay", "atabayaslinaz@gmail.com", "123456", "�stanbul", 21);
		
		StudentManager studentManager1 = new StudentManager();
		studentManager1.addStudent("Asl�naz");
		studentManager1.arrangeStudent("Asl�naz");
		studentManager1.deleteStudent("Asl�naz");
		
		
		System.out.println("   ");
		
		
		Instructor instructor1 = new Instructor(1, "Asl�naz", "Atabay", "atabayaslinaz@gmail.com", "123456", 1);
		
		InstructorManager instructorManager1 = new InstructorManager();
		instructorManager1.addInstructor("Asl�naz");
		instructorManager1.arrangeInstructor("Asl�naz");
		instructorManager1.deleteInstructor("Asl�naz");
		
		

		
		
		
	}

}
