package holiday;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int inputNumber=0;
		int count=0;
		int i,j;
		Person p[] = new Person[10];
		String searchName;
		
		
		while (true)
		{
			System.out.println("[회원주소록]\n"+"1. 회원정보등록\n"+"2. 전체회원보기\n "+"3. 회원정보검색\n "+"4. 프로그램 종료\n");
			
			switch(inputNumber)
			{
			case 1: 
				if (count >10)
				{
					System.out.println("더이상 입력할 수 없습니다");
				}
// 				System.out.println("회원번호:");
// 					p.setNumber(scan.next(count)); // # p isn't Person Object. 
// 					// # what is p. >>> pls check your code in line : '14'
// 					System.out.println("이름:");
// 					p.setName(scan.next(count));
// 					System.out.println("전화번호:");
// 					p.setPhone(scan.next(count));
// 					System.out.println("주소:");
// 					p.setAddress(scan.next(count));
// 					count++;
					
					// # you could use your Person object like this.
                    			System.out.println("회원번호:");
                    			String number = scan.next();
                    			System.out.println("이름:");
                    			String name = scan.next();
                    			System.out.println("전화번호:");
                    			String phone = scan.next();
                    			System.out.println("주소:");
                    			String address = scan.next();

                    			// create Person by using constructor.
                    			p[count] = new Person(
                    			        number,
                    			        name,
                    			        phone,
                    			        address
                    			);
                    			count++;
				
			
			case 2: 
				System.out.println("[전체회원목록]");
				for (i=0; i<count ; i++)
					p.print[i];
			case 3: 
				System.out.println("[회원검색]");
				System.out.println("검색할 회원 이름");
				searchName = scan.next();
				
				 
					for(j=0 ; j< count ; j++)
					{
						if (searchName.equals(p.setName))
						p.print(j)
					}
					
				
			case 0:
				System.out.println("프로그램 종료");
				return; 
				
			default:
				System.out.println("다시입력하세요");
				
			}
			
			
			}
		}
	}

/*[문제 4] 회원의 전화번호와 주소를 등록, 검색할 수 있는 프로그램을 작성하시오.

[조건]
- 다음과 같은 Person 클래스를 정의하여 회원 1명의 정보를 담을 수 있게 한다.
	회원주소록 프로그램에서 한명의 회원정보를 나타내는 클래스.
	회원번호, 이름, 전화번호, 주소 이렇게 3가지의 속성을 가진다.
	모든 필드는 접근 지정자가 private이며, 
	각 필드의 값을 변경하는 Setter와 각 필드의 값을 읽어서 리턴하는 Getter를 가진다.
	기본생성자와 모든 필드값을 전달받아 초기화하는 생성자를 가진다.
	각 필드의 값을 다음과 같이 출력하는 print()메소드를 정의한다.   
	
- 메뉴를 출력하고 메뉴 번호를 입력받아 해당 기능을 수행한다.
- 0번 메뉴를 선택할 때까지 프로그램은 반복된다.
- 회원정보는 원소 10개짜리  Person배열을 생성하여 저장한다.
	예) Person p[] = new Person[10];
	    p[0] = new Person(1, "홍길동", "010-111-2222", "서울시");
	    p[0].print();
	    
- 10명이 등록되면 1번 메뉴를 선택했을 때, 더이상 등록할 수 없다는 메시지를 출력한다.
- 검색 기능은 회원 이름을 입력받아, 등록된 모든 회원과 비교한 후 찾으면 회원 정보를 출력한다.

[실행 예]

[ 회원 주소록 ]
1. 회원 정보 등록
2. 전체 회원 보기
3. 회원 정보 검색
0. 프로그램 종료
메뉴 번호 선택> 1

회원 번호 : 1
이름 : 홍길동
전화번호 : 010-111-1111
주소 : 서울시

[ 회원 주소록 ]
1. 회원 정보 등록
2. 전체 회원 보기
3. 회원 정보 검색
0. 프로그램 종료
메뉴 번호 선택> 1

회원 번호 : 2
이름 : 김철수
전화번호 : 010-222-2222
주소 : 부산시

[ 회원 주소록 ]
1. 회원 정보 등록
2. 전체 회원 보기
3. 회원 정보 검색
0. 프로그램 종료
메뉴 번호 선택> 2

[ 전체 회원 목록 ]
번호:1	이름:홍길동	전화번호:010-111-1111	주소:서울시
번호:2	이름:김철수	전화번호:010-222-2222	주소:부산시

[ 회원 주소록 ]
1. 회원 정보 등록
2. 전체 회원 보기
3. 회원 정보 검색
0. 프로그램 종료
메뉴 번호 선택> 3

[ 회원 검색 ]
검색할 회원 이름 : 김철수
번호:2	이름:김철수	전화번호:010-222-2222	주소:부산시

[ 회원 주소록 ]
1. 회원 정보 등록
2. 전체 회원 보기
3. 회원 정보 검색
0. 프로그램 종료
메뉴 번호 선택> 0
프로그램을 종료합니다.
*/

