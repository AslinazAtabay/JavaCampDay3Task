
public class Instructor extends User {
	
	private int courseId;
	
	public Instructor() {
		
	}	
	
	public Instructor(int id, String firstName, String lastName, String email, String password, int courseId) {
		this.courseId= courseId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
}