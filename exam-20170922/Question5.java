import java.util.*;
class Question5 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int option=0,i,j,c=0;
		
		String phoneBook[][] = new String[5][2];

		String name;
		
		for (i=0;i<5 ;i++ )
		{
			
			c++;
			
			for (j=0;j<2 ;j++ )
			{
				System.out.print("[전화번호부]\n1.입력\n2.전체출력\n3.검색\n0.종료\n선택: ");
				
				option = scan.nextInt();
			
			switch(option)
				{
			case 1: 
				
				System.out.print("[새 전화번호 등록]\n이름:");
			
				phoneBook[i][0] = scan.next();
				
				
				System.out.print("전화번호:");
				
				phoneBook[i][1] = scan.next();
				
				if (c!=0)
				break;
				
				
				
			
			case 2: 
				System.out.print("[전체 전화번호 출력]");
				System.out.print("이름: "+phoneBook[i][0]);
				System.out.print("전화번호: "+phoneBook[i][1]);
				
				break;
			
			case 3: 
				System.out.print("[전화번호 검색]\n검색할 이름: ");
				name = scan.next();
				if (name.equals(phoneBook[i][0]))
				
				System.out.print("검색된 전화번호 :" + phoneBook[i][1]);
				

				break;
			
			default: 
				System.out.print("프로그램을 종료합니다.");
			return;
		}
		System.out.println();
			}
			
	}
}
}
		
		
		
		
		
	

