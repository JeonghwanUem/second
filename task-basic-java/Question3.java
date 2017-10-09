package holiday;

import java.util.*;

public class Question3 {

	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		int sum = 0;
		int j=0;
		int i=0;
		int z=1;
		char l;
		String s1;
		String str;; 
		
		
		System.out.println("수식 입력:");
		
		str= scan.nextLine();
		
		int total = str.charAt(0)-'0';
		
		//ch[i]= scan.next().charAt(0);//케릭터 값 입력할 때는 이렇게 입력해야 한다. 
		for (i = 0 ; i < str.length()-1 ; i+=2)
		{
			
			
			if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
		}
		else 
		{
			System.out.println("수식 잘못 입력");
			return;
		}
			
		for (j = 1 ; j< str.length()-1 ; j+=2)
		{
			if(str.charAt(j)=='+'||str.charAt(j)=='-'||str.charAt(j)=='*'||str.charAt(j)=='/') 	
			{
		}
			else 
			{
				System.out.println("수식 잘못 입력");
				return;
			}
		}
			
		}
		
		
			if (!(str.endsWith("=")))
			{
				System.out.println("수식 잘못 입력");
				return;
			}
			
			
			
			for (j=2 ; j < str.length(); j+=2)
		{	
			int second = str.charAt(j)-'0';
			
			l= str.charAt(z);
			
			
							
			if (l=='+')
			{
				total+=second;  
				z+=2;
			}
				else if (l=='-')
			{
				total-=second;
				z+=2;
			}
				else if (l=='*')
			{
				total*=second;
				z+=2;
			}
				else if (l=='/')
			{
				total/=second;
				z+=2;
			}
				else if (l=='=')
			{
				total = total;
				
				break;
			}
			
		}
			System.out.println("합계="+total);
		}
		

	}
