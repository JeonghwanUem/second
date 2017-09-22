
import java.util.*;

class LetterDiff

 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
        
		String salam = salam = scan.nextLine();
		char s = salam.charAt(0);
		
		System.out.println( "The value of " + s + " is " + (int)s );
	
		String salam1 = salam1 = scan.nextLine(); ;
		char d = salam1.charAt(0);
		
		System.out.println( "The value of " + d + " is " + (int)d );
		
		if (salam == salam1)
		System.out.println("same");
		

		else 
		System.out.println("The diffence = " +(s-d));


	}
}
