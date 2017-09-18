import java.util.*;
class  TTT_final
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int i, j, z,n ;
		boolean turn = false;
		
		boolean playing = true;
		while(playing) {
			if(turn) {
				System.out.println("it's O's turn, put O on the board.");
				n = scan.nextInt();
			} else {
				System.out.println("it's X's turn, put X on the board.");
				n = scan.nextInt();
			}
			
			turn = !turn;
		}
		
// 		System.out.println( "game is getting start now!!")
// 		System.out.println("it's X's turn, put X on the board")
// 		
// 		for ( z=0; z<9 ; z+=3 )
// 		{for ( j =0 ; j<1 ; j++ )
// 		for ( i = z; i<z+3 ; i++ )
// 		{boolean = true;
// 			if (n<9)
// 			{System.out.println("O")
// 		n = scan.nextInt();}
// 		else 
// 			{System.out.println("wrong #")}
// 		System.out.println("O's turn")
// 		}
// 		boolean = false; 
// 		System.out.println("X's turn")
// 		
// 			System.out.print(i+" ");
// 		}
// 		System.out.println(" ");
// 		}
// 		for ( n=0 ; n<9; n++)
// 		{
// 		switch (n)
// 		{
// 		case 1:0+1+2;
// 		break;
// 		case 1:3+4+5;
// 		break;
// 	    case 1:6+7+8;
// 		break;
// 		case 1:0+3+6;
// 		break;
// 		case 1:1+4+7;
// 		break;
// 		case 1:2+5+8;
// 		break;
// 		case 1:0+4+8;
// 		break;
// 		case 1:2+4+6;
// 		break;
// 		default : 
// 		System.out.println("draw")
// 		}
// 		}
// 		System.out.println("winner is" +" ")
// 		break;
// 		if ()
// 		{
// 		}
// 		while ()
// 		{
// 		}
// 		static void printBoard() {
// 		System.out.println("/---|---|---\\");
// 		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
// 		System.out.println("|-----------|");
// 		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
// 		System.out.println("|-----------|");
// 		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
// 		System.out.println("/---|---|---\\");


	}
}
