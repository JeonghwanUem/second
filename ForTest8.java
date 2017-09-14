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
		
		for (i=0; i<5;i++ )
		{for (j=i;j<i+5 ;j++ )
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
		
		for ( i = 0; i <= 4; i++ ) 
		{
			for (j = i; j <= i+4;j++ )
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
			for (i =5; i<=8 ;i++ )
			{for (j=5; j<=i&&j>0;j-- )
			{System.out.print(j+"  ");
			}
			System.out.println();//여기 ln안쓰니깐 오류난다
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
