package FirstClass;

import java.util.Scanner;


public class MainClass  {

	
	public static void main(String[] args) {//���� �Լ��� ����ϰ� ĥ �� ������ �� ���� 
	
		
		
	/* 1. teacher class �迭�� �����Ѵ�. ������� 3
	 2. �ؿ��� ���� �޴� ȭ���� �����Ѵ� 
	--------------
	 �޴�
	//1.��� �̸� ���� ���� ������ �Է¹޴´� 
	2.���
	0.����
	----------------
	3.����ڷ� ���� ��ȣ�� �Է¹޾Ƽ� teacher ��ü ������ �����Ѵ� 
	4.������ teacher��ü�� �迭�� ��Ƽ� �����Ѵ�
	��� �޴��� ������ ��ϵ� ��ü�� ������ ���� ��µȴ� 
	0���� ������ ������ �޴��� ��� ��µȾ�� �Ѵ� 
	*/
		int menu;
		int count = 0;
		int i, j;
		Scanner scan = new Scanner(System.in);
		Teacher teacher = new Teacher();
		Teacher t[] = new Teacher[3];

		while (true) {
			System.out.println("1.���  \r\n" + "2.���\r\n" + "0.����");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				if (count == 3) {

					System.out.println("�� �̻� ����� �� �����ϴ�.");
					break;
				}

				System.out.println("�̸�");
				teacher.setName(scan.next());
				System.out.println("����");
				teacher.setAge(scan.nextInt());
				System.out.println("����");
				teacher.setGender(scan.next());
				System.out.println("����");
				teacher.setSubject(scan.next());

				t[count] = teacher;// new Teacher(teacher.getName(), teacher.getAge(), teacher.gerGender(),
									// teacher.getSubject());
	
	
				boolean flag = false; 			// �� ���⼭ ���� ���� ������ ����. ó���Է� ���̶� �����Է°��� ������ Ȯ���ϴ� �ڵ�

				for (i = 0; i < count; i++) { 	// toString�� �ּҰ����� �ϰ� equals�� ��簪

					if (!t[i].equals(teacher)) { 	// �� ó�� �Է� �� �̶� ������ �� �ڵ�
						flag = true; 				// ������ true
					} else {
						flag = false;			 // Ʋ���� false
						break;						 // break �� �ݺ��� ����
					} 								// ����? ����? �G.. �ɱ游 �Ȱ� �ͳ�..����
				}
													// ó�� ���ǹ��� �۵� ���� �ʾƼ� flag���� flase�� if �� �۵����ؼ�
				if (count != 0) {
					if (flag == false) { // �־��� �ڵ�
						i--;
						System.out.println("�̹� ��ϵǾ� �ֽ��ϴ�.");
						continue;// ���� ����� ���� �Է°��� ������ �۵��ȴ�
					}

				}
				count++;	
				
				break;
	
			case 2:
				System.out.println("���");

				for (i = 0; i < count; i++) {

					System.out.println(t[i]);
				}
				break;

			case 0:
				System.out.println("����");
				return;
			}
	

		/*	Human h1= new Teacher("������1",20,"����", "����");
			Human h2; 
			Teacher t3 = new Teacher();
			h2 = t3; 
			Human h2= new Teacher("������2",21,"����", "����");
			
			Teacher t1 = (Teacher)h1;
			Teacher t2= (Teacher)h2;
			System.out.println(x);
			
			if (h1 instanceof Teacher) {
				System.out.println("teacher ��ü");
				
			}
			else if (h1 instanceof Student) {
				System.out.println("student ��ü");
		}*/
			
			/*boolean flag = false; 
			int y = 0;
			if ( y !=0) {
			for (y = 0; y< count; y++) {
				
				if(!(t[y].equals(t))) {
					flag =true;
				}
				else if (t[y]==null) {
					flag = false;
					break;
				}
				else {
					flag = false;
					break;
				}
				if (!(t instanceof Teacher[]))
					return false; 
				*/


				

			
			
			}
			}
}

		


	
	


	

