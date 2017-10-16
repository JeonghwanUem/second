package FirstClass;

public class Teacher extends Human {

	/*Human Class를 상속받는다 
	과목 필드를 가진다
	기본 생성자를 생성한다 
	모든 필드에(상속받는 값 포함) 에 초기값을 설정하는 생성자를 생성한다 
	단 부모의 생성자를 호출하여 설정한다
	Teacher class의 필드와 getter setter를 생성한다 
	모든 필드(상속받는 값 포함)를 출력하는 toString 함수를 재정의한다 
	부모의 toString 함수를 호출하여 설정한다 
	*/
	private String subject;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, int age, String gender, String subject) {
	
		super(name, age, gender);
		this.subject = subject; 
	}
		
	public void setSubject(String subject) {
		
		this.subject = subject;
	}
	
	public String getSubject() {
		
		return subject;
	}
	
	@Override//super는 그냥 그 상위 개념을 불러오는 문구이다 그 뒤에 머가 오던 상관없다 	
	public String toString() {
		 
		return super.toString()+ "subject: " + subject;
	}
		
/*		public boolean equals(object obj) {
			if(!(obj instanceof Teacher)) {
				return false; 
			}
			Teacher t = (Teacher)obj;
			if (subject == null) {
				return false; 
			}
			if(t.subject == null) {
				return false;
			}
			if(this.subject.equals(t.subject)) {
				return false; 
			}
				return true; 
		}
	}*/


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Teacher))
			return false;
		Teacher other = (Teacher) obj;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	}
	
	

	
	
