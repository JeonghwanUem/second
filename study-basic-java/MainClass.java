package FirstClass;

import java.util.Scanner;


public class MainClass  {

	
	public static void main(String[] args) {//메인 함수를 기억하고 칠 수 있으면 더 좋다 
	
		
		
	/* 1. teacher class 배열을 생성한다. 사이즈는 3
	 2. 밑에와 같은 메뉴 화면을 구성한다 
	--------------
	 메뉴
	//1.등록 이름 나이 성별 과목을 입력받는다 
	2.출력
	0.종료
	----------------
	3.사용자로 부터 번호를 입력받아서 teacher 객체 정보를 생성한다 
	4.생성한 teacher객체는 배열에 담아서 저장한다
	출력 메뉴를 누르면 등록된 객체의 정보다 전부 출력된다 
	0번을 누르기 전까지 메뉴가 계속 출력된어야 한다 
	*/
	int menu;
	int count=0;
	int i,j;
	Scanner scan = new Scanner(System.in);
	Teacher teacher = new Teacher();
	Teacher t[] = new Teacher[3];
	
	
	while(true) {
	System.out.println("1.등록  \r\n" +"2.출력\r\n" + "0.종료");
	menu = scan.nextInt();
	
	switch(menu){
	
	case 1: 
	if (count == 3){
		
		System.out.println("더 이상 등록할 수 없습니다.");
		break; 
	}
	
	System.out.println("이름");
	teacher.setName(scan.next());
	System.out.println("나이");
	teacher.setAge(scan.nextInt());
	System.out.println("성별");
	teacher.setGender(scan.next());
	System.out.println("과목");
	teacher.setSubject(scan.next());
	
	
	t[count] = new Teacher(teacher.getName(), teacher.getAge(), teacher.gerGender(), teacher.getSubject());
	count++;
	break;
	
	
	case 2: 
		System.out.println("출력");
		
		for (i=0 ; i<count ; i++) {
		
			System.out.println(t[i]);
		}
		break; 
		
	case 0: 
		System.out.println("종료");
		return;
	}
	
	

		/*	Human h1= new Teacher("선생님1",20,"남자", "수학");
			Human h2; 
			Teacher t3 = new Teacher();
			h2 = t3; 
			Human h2= new Teacher("선생님2",21,"여지", "영어");
			
			Teacher t1 = (Teacher)h1;
			Teacher t2= (Teacher)h2;
			System.out.println(x);
			
			if (h1 instanceof Teacher) {
				System.out.println("teacher 객체");
				
			}
			else if (h1 instanceof Student) {
				System.out.println("student 객체");
		}*/
			
			boolean flag = false; 
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
				


				

			
			
			}
			}
			

		


	}
	}
}

	

