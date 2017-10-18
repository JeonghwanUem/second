package FirstClass;

public class Human {
/*이름과 나이 성별을 필드로 가진다
모든 필드는 private 접근지정자를 설정한다
모든 필드에 초기값을 설정하는 생성자와 기본 생성자를 생성한다
 모든 필에드 getter setter를 생성한다 
 human 클래스의 정보를 출력하는 toString 함수를 재정의한다 */
		
	private String name, gender; 
	private int age; 
	
	
	public Human() {
		
	}
	
	public Human(String name, int age, String gender) {
		
		this.name = name; 
		this.age = age;
		this.gender = gender;
	}
	
	public void setName(String name) {//여기도 매게변수 괄호안에 넣어줘야 하는게 계속 까먹는다  개빠가인듯하다
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setAge(int age) {
		
		this.age = age; 
	}
	
	public int getAge() {
		
		return age; 
	}
	
	public void setGender(String gender) {
		
		this.gender = gender; 
	}
	
	public String gerGender() {
		
		return gender; //getter는 매개변수는 없는데신 return 이있으므로 기억하기는 비교적 쉽다 반대로 생각하면 되니깐
		
	}
	
	
	
	@Override//재정의를 했다는 것을 명시적으로 알려주기 위해 어노테이션을 붙여줘야 한다. 
	public String toString() {
		
		return "name: "+ name + "age: " + age + "gender:" + gender;
		
	}
	
	public void getHuman(Human h) {
		if (h instanceof Teacher) {
			System.out.println("teacher 객체");
	} 
	else if (h instanceof Student) {
			System.out.println("student 객체");
		
	}
	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)//주소비교 
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Human))//상속간계에 있느냐  뜬금없는 클레스를 걸러주기 위한 
			return false;
		Human other = (Human) obj;//하향 
		if (age != other.age)
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
