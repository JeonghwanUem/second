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
				System.out.print("[��ȭ��ȣ��]\n1.�Է�\n2.��ü���\n3.�˻�\n0.����\n����: ");
				
				option = scan.nextInt();
			
			switch(option)
				{
			case 1: 
				
				System.out.print("[�� ��ȭ��ȣ ���]\n�̸�:");
			
				phoneBook[i][0] = scan.next();
				
				
				System.out.print("��ȭ��ȣ:");
				
				phoneBook[i][1] = scan.next();
				
				if (c!=0)
				break;
				
				
				
			
			case 2: 
				System.out.print("[��ü ��ȭ��ȣ ���]");
				System.out.print("�̸�: "+phoneBook[i][0]);
				System.out.print("��ȭ��ȣ: "+phoneBook[i][1]);
				
				break;
			
			case 3: 
				System.out.print("[��ȭ��ȣ �˻�]\n�˻��� �̸�: ");
				name = scan.next();
				if (name.equals(phoneBook[i][0]))
				
				System.out.print("�˻��� ��ȭ��ȣ :" + phoneBook[i][1]);
				

				break;
			
			default: 
				System.out.print("���α׷��� �����մϴ�.");
			return;
		}
		System.out.println();
			}
			
	}
}
}
		
		
		
		
		
	

