import java.util.*;

class  TTT_final_2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int h, y;
		
		int i = 0, j, z,n,x=0 ;
		
		boolean turn = false;
		
		String turns = "X"; 
		
		String line;
		
		String[] board  = new String[8];
		
		String[][] ar = {{"0","1","2"},{"3","4","5"},{"6","7","8"}};
		
		boolean  playing = true; 
		
		while (playing)
		
		{
			if (turn)
			
		{
			
			System.out.println("it's O's turn, put O on the board");
		
			h = scan.nextInt();
			
			y = scan.nextInt();
			
		}	
		
		
		else 
		
		{
			System.out.println("it's X's turn, put X on the board");
		
			h = scan.nextInt();
			
			y = scan.nextInt();


		}
		
			turn = !turn;
		
		
		for (i=0;i<3 ;i++ )
		
		{
		
			for (j=0;j<3 ;j++ )
		
			{
				
				if (ar[i][j]=="3"||ar[i][j]=="6")
				
				{
					System.out.print("\n");

				}
			
					System.out.print(ar[i][j]);
				
		
					if ( turn )
				
					{
						
							ar[h][y] = "X";
					}
					
					else
				
							ar[h][y] = "O";
		}
		
		}
		
					System.out.println(" ");
		
		
		
		}
	}
}
