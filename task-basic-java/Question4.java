package holiday;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int inputNumber=0;
		int count=0;
		int i,j;
		Person person = new Person();
		Person p[] = new Person[10];
		String searchName;
		
		
		while (true)
		{
			System.out.println("[ȸ�� �ּҷ�]");
            System.out.println("1.ȸ�� ���� ���");
            System.out.println("2.��ü ȸ�� ����");
            System.out.println("3.ȸ�� ���� �˻�");
            System.out.println("0.���α׷� ����");
            System.out.print("�޴� ��ȣ ����> ");
			
			inputNumber = scan.nextInt();
			
			switch(inputNumber)
			{
			case 1: 
				if (count == p.length)
				{
					System.out.println("���̻� �Է��� �� �����ϴ�");
					break; 
				}
				System.out.println("ȸ����ȣ:");
					person.setNumber(scan.next());
					System.out.println("�̸�:");
					person.setName(scan.next());
					System.out.println("��ȭ��ȣ:");
					person.setPhone(scan.next());
					System.out.println("�ּ�:");
					person.setAddress(scan.next());
					
					p[count] = new Person(person.getNumber(), person.getName(), person.getPhone(), person.getAddress());
					count++;
					break;
				
			
			case 2: 
				System.out.println("[��üȸ�����]");
				for (i=0; i<count ; i++)
					p[i].print();
				break;
			case 3: 
				System.out.println("[ȸ���˻�]");
				System.out.println("�˻��� ȸ�� �̸�");
				searchName = scan.next();
				
				 
					for(j=0 ; j< count ; j++)
					{
						if (searchName.equals(p[j].getName()))
						p[j].print();
					}
					break; 
				
			case 0:
				System.out.println("���α׷� ����");
				return; 
				
			default:
				System.out.println("�ٽ��Է��ϼ���");
				break;
				
			}
			
			
			}
		}
	}
