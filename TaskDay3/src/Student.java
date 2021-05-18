
public class Student extends User {
	
	private String city;
	private int age;
	
	public Student(int id, String firstName, String lastName, String email, String password, String city, int age) {
		this.city= city;
		this.age= age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
