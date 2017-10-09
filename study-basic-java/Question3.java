package holiday;

import java.util.*;

public class Question3 {

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		int sum = 0;
		int even=0;
		int j=0;
		String s1;
		String str;; 
		char ar[] = {'0','1','2','3','4','5','6','7','8','9','+','-','*'};
		int i=0;
		
		System.out.println("수식 입력:");
		
		//ch[i]= scan.next().charAt(0);//케릭터 값 입력할 때는 이렇게 입력해야 한다. 
		
			str= scan.next();
			for (i=0 ; i< str.length(); i++)
		{
				s1= str.substring(i,i+1);
			if (s1.equals(ar[i]))
		{
			System.out.println("잘못입력");
			return;
			
		}
			if (ar[ar.length]!='=')
			{
				System.out.println("잘못입력");
				break;
			}
			
		}
			
			
			if (even%2 == 0)
		{
			if (ar[even]=='+'||ar[even]=='-'||ar[even]=='*')
		{
			System.out.println("잘못입력");
		}
		
			
		}
			
			for (j=0 ; j < str.length(); j++)
		{
				int number1= Integer.parseInt(str.substring(j-1,j));
				int number2= Integer.parseInt(str.substring(j+1,j+2));
			
			if (str.substring(j,j+1).equals("+"))
			{
				sum= number1 + number2;
				
			}
			if (str.substring(j,j+1).equals("-"))
			{
				sum= number1 - number2;
				
			}
			if (str.substring(j,j+1).equals("*"))
			{
				sum= number1 * number2;
				
			}
			
			if (str.substring(str.length()).equals("="))
			{
				System.out.println(sum);
			}
		}
		}
		

	}
/*[문제 3] 문자열로 수식을 입력받아 계산하여 결과를 출력한다.
[조건]
- 한자리 양의 정수들과 사칙연산이 포함된 수식을 문자열로 입력받는다.
- 수식의 마지막은 반드시 '=' 문자로 끝나야 한다.
- 연산자 우선 순위 고려하지 않고 입력된 순서대로 계산한다.
- 0~9, +, -, *, / 이외의 문자가 표함되어 있으면 에러메시지 출력하고 프로그램을 종료한다.

[참고]
- 문자열 타입의 숫자를 int형으로 변환하는 방법은 다음과 같다.
  String을 int로 변환해주는 Integer클래스의 메소드를 이용한다.
  	String s = "1";
	int i = Integer.parseInt(s);	//i는 1
	
- 문자 타입의 숫자를 int형으로 변환하는 방법은 다음과 같다.
  해당 문자의 유니코드값에서 문자 '0'의 유니코드값을 뺀다.
	char c = '1';
	int i = c - '0';		//i는 1
	
실행예1
수식입력 : 1+a
수식이 잘못되었습니다.

실행예2
수식입력 : 1+2*3
수식이 잘못되었습니다.

실행예3
수식입력 : 1+2*3=
결과는 9
*/


