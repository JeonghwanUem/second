package FirstClass;

public class Teacher extends Human {

	/*Human Class�� ��ӹ޴´� 
	���� �ʵ带 ������
	�⺻ �����ڸ� �����Ѵ� 
	��� �ʵ忡(��ӹ޴� �� ����) �� �ʱⰪ�� �����ϴ� �����ڸ� �����Ѵ� 
	�� �θ��� �����ڸ� ȣ���Ͽ� �����Ѵ�
	Teacher class�� �ʵ�� getter setter�� �����Ѵ� 
	��� �ʵ�(��ӹ޴� �� ����)�� ����ϴ� toString �Լ��� �������Ѵ� 
	�θ��� toString �Լ��� ȣ���Ͽ� �����Ѵ� 
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
	
	@Override//super�� �׳� �� ���� ������ �ҷ����� �����̴� �� �ڿ� �Ӱ� ���� ������� 	
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
	
	

	
	
