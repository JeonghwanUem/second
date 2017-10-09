package holiday;

public class Person {
	// 필드 만들기
	private String number;
	private String name;
	private String phone;
	private String address;
	
	//초기화 생성자 설정 
	public Person(String number,String name,String phone,String address)//어떤 좋류의 변수가 쓰이는지 같이 들어가 줘야 한다 
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
		System.out.println("회원번호"+number+"\n이름"+name+"\n전화 번호"+phone+"\n주소"+address);
	}
	
	
	
	
}
