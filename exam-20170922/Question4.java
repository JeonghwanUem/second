import java.util.*;

class Question4
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

			int numberOfInt, i, total=0;
		
			System.out.print("�Է��� ������ ����: ");
		
			numberOfInt = scan.nextInt();
	    
			int number[] = new int[numberOfInt];
		
		
		if (numberOfInt == 0)
		{
			System.out.println("1�̻� �Է��ؾ� �մϴ�.");
			return;
		}
		
		
		for ( i = 0 ; i < numberOfInt ; i++ )
		{ 
		  
		    System.out.print("�����Է�"+"["+i+"] =");
		  
			number[i] = scan.nextInt();
		  
			total+=number[i];
			
		}

		for (i= 0; i < numberOfInt; i++ )
		{
			System.out.print(number[i]+"+");
		}
		
			System.out.print("\b");
			
			System.out.print("="+total);

			
	}
}
