package holiday;

public class Person {
	// �ʵ� �����
	private String number;
	private String name;
	private String phone;
	private String address;
	
	//�ʱ�ȭ ������ ���� 
	public Person(String number,String name,String phone,String address)//� ������ ������ ���̴��� ���� �� ��� �Ѵ� 
	{
		this.number = number;
		this.name = name;
		this.phone = phone; 
		this.address = address; 
	}
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void print()
	{
		System.out.println("ȸ����ȣ"+number+"\n�̸�"+name+"\n��ȭ ��ȣ"+phone+"\n�ּ�"+address);
	}
	
	
	
	
}
