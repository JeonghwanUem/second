package FirstClass;

public class Human {
/*�̸��� ���� ������ �ʵ�� ������
��� �ʵ�� private ���������ڸ� �����Ѵ�
��� �ʵ忡 �ʱⰪ�� �����ϴ� �����ڿ� �⺻ �����ڸ� �����Ѵ�
 ��� �ʿ��� getter setter�� �����Ѵ� 
 human Ŭ������ ������ ����ϴ� toString �Լ��� �������Ѵ� */
		
	private String name, gender; 
	private int age; 
	
	
	public Human() {
		
	}
	
	public Human(String name, int age, String gender) {
		
		this.name = name; 
		this.age = age;
		this.gender = gender;
	}
	
	public void setName(String name) {//���⵵ �ŰԺ��� ��ȣ�ȿ� �־���� �ϴ°� ��� ��Դ´�  �������ε��ϴ�
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
		
		return gender; //getter�� �Ű������� ���µ��� return �������Ƿ� ����ϱ�� ���� ���� �ݴ�� �����ϸ� �Ǵϱ�
		
	}
	
	
	
	@Override//�����Ǹ� �ߴٴ� ���� ��������� �˷��ֱ� ���� ������̼��� �ٿ���� �Ѵ�. 
	public String toString() {
		
		return "name: "+ name + "age: " + age + "gender:" + gender;
		
	}
	
	public void getHuman(Human h) {
		if (h instanceof Teacher) {
			System.out.println("teacher ��ü");
	} 
	else if (h instanceof Student) {
			System.out.println("student ��ü");
		
	}
	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)//�ּҺ� 
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Human))//��Ӱ��迡 �ִ���  ��ݾ��� Ŭ������ �ɷ��ֱ� ���� 
			return false;
		Human other = (Human) obj;//���� 
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
