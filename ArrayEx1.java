import java.util.*;
class ArrayEx1
{
 
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String subject[] = {"��", "��", "��"};
		int student = scan.nextInt();
		int ar[][]  = new int[student][5];
		int i,j;
		
		
		for ( i=0; i <ar.length ;i++ )
		{
		System.out.println((i+1)+"�� �л� ������ �Է�>");
		
		for (j =0;j<ar[i].length-2 ;j++ )
		{
			
		System.out.println(subject[j]);
		ar[i][j] = scan.nextInt();
		}
		}

	
	System.out.println("��ȣ   ��      ��      ��    ����   ���");
			for ( i = 0; i<ar.length ; i++ )
			{System.out.print((i+1)+"\t");
			for (j=0; j <ar[i].length-2 ; j++)
			{System.out.print(ar[i][j]+"\t");
			}
			}
	}
}

/*
[���࿹]
1�� �л� ������ �Է�>
����: 100
����: 100
����: 100
2�� �л� ������ �Է�>
����: 100
����: 100
����: 100
3�� �л� ������ �Է�>
����: 100
����: 100
����: 100


=================================
��ȣ   ����    ����		����	����   ��� 
1��    100		100		100		300		100.0
2��    100		100		100		300		100.0
3��    100		100		100		300		100.0
___________________________________________-
���    100		100		100

���� �� �л�
���� �� ������ ���
int ���� �ϳ��� ������ �迭 
�ο����� �þ�� ����� �ǵ��� 
*/
