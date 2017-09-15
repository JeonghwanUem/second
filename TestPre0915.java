import java.util.*;
class TestPre0915
{
	// # you can create private member variant on this class.
	private Scanner mScan;
	
  	public static void main(String[] args) 
	{
		mScan = new Scanner(System.in);
		
		int i;
		String str="메뉴를 선택했습니다.";
		while (true) {
			System.out.print("[성적 관리 프로그램]\n1.입력\n2.삭제\n3.수정\n4.검색\n선택 > ");
		
			i= mScan.nextInt();
		
			if (i>4) {
				System.out.println("잘못입력했습니다");
				break;
			}
		
			switch (i) {
				case 1: 
					System.out.println("입력"+str); 
					break;
		
				case 2: 
					System.out.println("삭제"+str); 
					break;
		
				case 3: 
					System.out.println("수정"+str); 
					break;
		
				case 4: 
					System.out.println("검색"+str);
					break;

				default :
					System.out.println("프로그램을 종료합니다"); 
					return;
			} // # end of switch statement
			
		} // # end of while loop

		System.out.println(" "); 
		
	}
}

/*
[성적 관리 프로그램]
1.입력
2.삭제
3.수정
4.종료
선택 > _1

입력메뉴 선택했습니다. 

0입력하면==>프로그램을 종료합니다==>끝

5라고 입력하면 잘못된 번호입니다. ==>다시 메인으로


while 을 사용해서if switch*/
