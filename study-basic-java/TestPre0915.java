import java.util.*;
class TestPre0915
{
  	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int i;
		String str="�޴��� �����߽��ϴ�.";
		while (true)
		{
		System.out.print("[���� ���� ���α׷�]\n1.�Է�\n2.����\n3.����\n4.�˻�\n���� > ");
		
		i= scan.nextInt();
		
		if (i>4)
		{System.out.println("�߸��Է��߽��ϴ�"); break; 
		}
		
		switch (i)
		{
		case 1: System.out.println("�Է�"+str); break;
		
		case 2: System.out.println("����"+str); break;
		
		case 3: System.out.println("����"+str); break;
		
		case 4: System.out.println("�˻�"+str); break;

		default : System.out.println("���α׷��� �����մϴ�"); return;
		}
		}

		System.out.println(" "); 
		
	}
}

/*
[���� ���� ���α׷�]
1.�Է�
2.����
3.����
4.����
���� > _1

�Է¸޴� �����߽��ϴ�. 

0�Է��ϸ�==>���α׷��� �����մϴ�==>��

5��� �Է��ϸ� �߸��� ��ȣ�Դϴ�. ==>�ٽ� ��������


while �� ����ؼ�if switch*/