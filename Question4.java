import java.util.*;

class Question4
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);

			int numberOfInt, i, total=0;
		
			System.out.print("입력할 정수의 개수: ");
		
			numberOfInt = scan.nextInt();
	    
			int number[] = new int[numberOfInt];
		
		
		if (numberOfInt == 0)
		{
			System.out.println("1이상 입력해야 합니다.");
			return;
		}
		
		
		for ( i = 0 ; i < numberOfInt ; i++ )
		{ 
		  
		    System.out.print("정수입력"+"["+i+"] =");
		  
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
