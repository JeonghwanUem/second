import java.util.*;
class Question3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int year; 
		long day = 0;
		int y;
		
		System.out.print("연도 입력: ");
		
		year = scan.nextInt();
		
		for ( y =1; y< year ; y++ )
		
		{
			if (y%4==0&&y%100!=0||y%400==0)
		
			day+=366;
		
		else
			day+=365;
		}
		
		
		System.out.println("서기1년"+"~"+y+"년까지 날짜수는"+day+"일입니다.");
	}
}
