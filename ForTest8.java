class ForTest8 
{
	public static void main(String[] args) 
	{
		int i,j,z;
	
	/*	1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5
		1 2 3 4 5 */
		
		// # not bad
		for (i=0; i<5;i++ )
		{for (j=1;j<6 ;j++ )
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}
		System.out.println("---------");

		  /*0
			0 1 
			0 1 2 
			0 1 2 3 
			0 1 2 3 4 */

		// # good job
		for (i=1; i<6;i++ )
		{for (j=0;j<i ;j++ )
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}
		System.out.println("---------");

		
	/*
		0 1 2 3 4 
		0 1 2 3 4
		0 1 2 3 4 
		0 1 2 3 4
		0 1 2 3 4 */
		
		// # not bad,
		for (i=1; i<6;i++ )
		{
		for (j=0;j<5 ;j++ )
		{System.out.print(" "+j);
		
		}
		System.out.println();
		}
		System.out.println("---------");

  
  /*0 0 0 0 0
	1 1 1 1 1 
	2 2 2 2 2 
	3 3 3 3 3 
	4 4 4 4 4  */
		
		// # think twice, code once.
		for ( i = 0; i <= 4; i++ ) 
		{
			for (j = 0; j <= 4;j++ )
			{
				
			
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
		System.out.println("-----------------");

		  /*1
		  2 2
		3 3	3	
	  4 4 4 4 
	5 5 5 5 5//
	
	*/
		
		// # easy way; use if-else statement
		for ( i=0; i<=5 ; i++ )
		{ for (  z=4; z>=i  ;z-- )
		{
			System.out.print("  ");
		}
			for ( j=1; j<=i ;j++ )
		{
			System.out.print(j+" ");
		}
			System.out.println();
		}
			
			System.out.println("-------------");

/*	5
	4 4
	3 3 3
	2 2 2 2
	1 1 1 1 1*/
		
		// # what happened here?
			for (i =5; i<=8 ;i++ )
			{for (j=5; j<=i&&j>0;j-- )
			{System.out.print(j+"  ");
			}
			System.out.println();//¿©±â ln¾È¾²´Ï±ñ ¿À·ù³­´Ù
			}
			System.out.print("----------------- ");

	
	
	/*
	0 1 2 3 4 
	0 1 2 3 4
	0 1 2 3 4 
	0 1 2 3 4
	0 1 2 3 4 //
	---------------
	0 0 0 0 0
	1 1 1 1 1 
	2 2 2 2 2 
	3 3 3 3 3 
	4 4 4 4 4  //
	--------------
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5 
	1 2 3 4 5
	1 2 3 4 5 //
	---------------
	0 1 2 3 4 
	1 2 3 4 5 
	2 3 4 5 6 
	3 4 5 6 7 
	4 5 6 7 8 //

	-------------
	5
	4 4
	3 3 3
	2 2 2 2
	1 1 1 1 1
	---------------
			1
		  2 2
		3 3	3	
	  4 4 4 4 
	5 5 5 5 5//
	
	*/
	
	
	}

}
