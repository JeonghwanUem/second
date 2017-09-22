class Question2 
{
	public static void main(String[] args) 
	{
		char ch;
		
		System.out.println("=== Unicode ǥ ===");
		
		for ( ch=48 ; ch<=122 ;ch++ )
		{
			System.out.print((int)ch+":"+ch+" ");
		
		if ((int)ch == 55||(int)ch == 63||(int)ch == 71||(int)ch == 79||(int)ch == 87||(int)ch == 96||(int)ch == 103||(int)ch == 111||(int)ch == 119)
		{
			System.out.println("\n");
		}
		}
		
	}
}
