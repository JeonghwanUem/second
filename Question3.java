import java.util.*;
class Question3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int year; 
		long day = 0;
		int y;
		
		System.out.print("���� �Է�: ");
		
		year = scan.nextInt();
		
		for ( y =1; y< year ; y++ )
		
		{
			if (y%4==0&&y%100!=0||y%400==0)
		
			day+=366;
		
		else
			day+=365;
		}
		
		
		System.out.println("����1��"+"~"+y+"����� ��¥����"+day+"���Դϴ�.");
	}
}
