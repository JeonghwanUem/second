package FirstClass;

public class Student extends Human {

	
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String gender, String major) {
		
		super(name, age ,gender);
		this.major = major; 
	}
	
	public void setMajor(String major) {
		this.major = major ;
	}
	
	public String getMajor() {
		return major;
	}
}
