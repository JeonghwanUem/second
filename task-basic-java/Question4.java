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
			System.out.println("[회원 주소록]");
            System.out.println("1.회원 정보 등록");
            System.out.println("2.전체 회원 보기");
            System.out.println("3.회원 정보 검색");
            System.out.println("0.프로그램 종료");
            System.out.print("메뉴 번호 선택> ");
			
			inputNumber = scan.nextInt();
			
			switch(inputNumber)
			{
			case 1: 
				if (count == p.length)
				{
					System.out.println("더이상 입력할 수 없습니다");
					break; 
				}
				System.out.println("회원번호:");
					person.setNumber(scan.next());
					System.out.println("이름:");
					person.setName(scan.next());
					System.out.println("전화번호:");
					person.setPhone(scan.next());
					System.out.println("주소:");
					person.setAddress(scan.next());
					
					p[count] = new Person(person.getNumber(), person.getName(), person.getPhone(), person.getAddress());
					count++;
					break;
				
			
			case 2: 
				System.out.println("[전체회원목록]");
				for (i=0; i<count ; i++)
					p[i].print();
				break;
			case 3: 
				System.out.println("[회원검색]");
				System.out.println("검색할 회원 이름");
				searchName = scan.next();
				
				 
					for(j=0 ; j< count ; j++)
					{
						if (searchName.equals(p[j].getName()))
						p[j].print();
					}
					break; 
				
			case 0:
				System.out.println("프로그램 종료");
				return; 
				
			default:
				System.out.println("다시입력하세요");
				break;
				
			}
			
			
			}
		}
	}
