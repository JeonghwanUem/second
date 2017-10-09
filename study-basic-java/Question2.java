package holiday;

import java.util.Scanner;

public class Question2 {

	
	
	public static void main(String[] args) {
	// 달력만들기 
		
		Scanner scan = new Scanner(System.in);//이문장은 보이드 안에 써야 실행된다 좆같다	
		
		int monthDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int totalDays;
		int i=0;
		int j=0;
		int year, month;
		int week=0; 
		
		System.out.println("년도를 입력하세요");
		year = scan.nextInt();
		System.out.println("월을 입력하세요");
		month = scan.nextInt();
		
		//전체 일 수 구하기  2017이면 2016년 까지의 일수를 구하기 윤년까지 합한 일수 
		totalDays = 365*(year-1)+(year-1)/400-(year-1)/100+(year-1)/4;
		
		//월까지 합산한 일수 구하기
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
		//요일 구하기 
		week = totalDays%7;
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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


	


