package holiday;

import java.util.Scanner;

public class Question2 {

	
	
	public static void main(String[] args) {
	// �޷¸���� 
		
		Scanner scan = new Scanner(System.in);//�̹����� ���̵� �ȿ� ��� ����ȴ� ������	
		
		int monthDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int totalDays;
		int i=0;
		int j=0;
		int year, month;
		int week=0; 
		
		System.out.println("�⵵�� �Է��ϼ���");
		year = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		month = scan.nextInt();
		
		//��ü �� �� ���ϱ�  2017�̸� 2016�� ������ �ϼ��� ���ϱ� ������� ���� �ϼ� 
		totalDays = 365*(year-1)+(year-1)/400-(year-1)/100+(year-1)/4;
		
		//������ �ջ��� �ϼ� ���ϱ�
		for (j = 0; j < monthDays[month-1]; j++)
		{
			totalDays+= monthDays[i];
			
			if (year%400==0||year%100==0&&year%4==0)
				{if (month>3)
				
				{
					totalDays++;
				}
				
				}
				
		}
		//���� ���ϱ� 
		week = totalDays%7;
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (i=0; i<week ; i++)
		{
			System.out.print("\t");
		}
		for (i = 1 ; i <= monthDays[month-1] ; i++)
		{
			System.out.print(i+"\t");
			week++;
			if (week%7 == 0)
			{
				System.out.println("\n");
			}
		}
			if (week%7 != 0)
			{
				System.out.println();
			}
		}
		
		
		
		
		}


	


