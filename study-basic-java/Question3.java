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
		
		System.out.println("���� �Է�:");
		
		//ch[i]= scan.next().charAt(0);//�ɸ��� �� �Է��� ���� �̷��� �Է��ؾ� �Ѵ�. 
		
			str= scan.next();
			for (i=0 ; i< str.length(); i++)
		{
				s1= str.substring(i,i+1);
			if (s1.equals(ar[i]))
		{
			System.out.println("�߸��Է�");
			return;
			
		}
			if (ar[ar.length]!='=')
			{
				System.out.println("�߸��Է�");
				break;
			}
			
		}
			
			
			if (even%2 == 0)
		{
			if (ar[even]=='+'||ar[even]=='-'||ar[even]=='*')
		{
			System.out.println("�߸��Է�");
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
/*[���� 3] ���ڿ��� ������ �Է¹޾� ����Ͽ� ����� ����Ѵ�.
[����]
- ���ڸ� ���� ������� ��Ģ������ ���Ե� ������ ���ڿ��� �Է¹޴´�.
- ������ �������� �ݵ�� '=' ���ڷ� ������ �Ѵ�.
- ������ �켱 ���� ������� �ʰ� �Էµ� ������� ����Ѵ�.
- 0~9, +, -, *, / �̿��� ���ڰ� ǥ�ԵǾ� ������ �����޽��� ����ϰ� ���α׷��� �����Ѵ�.

[����]
- ���ڿ� Ÿ���� ���ڸ� int������ ��ȯ�ϴ� ����� ������ ����.
  String�� int�� ��ȯ���ִ� IntegerŬ������ �޼ҵ带 �̿��Ѵ�.
  	String s = "1";
	int i = Integer.parseInt(s);	//i�� 1
	
- ���� Ÿ���� ���ڸ� int������ ��ȯ�ϴ� ����� ������ ����.
  �ش� ������ �����ڵ尪���� ���� '0'�� �����ڵ尪�� ����.
	char c = '1';
	int i = c - '0';		//i�� 1
	
���࿹1
�����Է� : 1+a
������ �߸��Ǿ����ϴ�.

���࿹2
�����Է� : 1+2*3
������ �߸��Ǿ����ϴ�.

���࿹3
�����Է� : 1+2*3=
����� 9
*/


