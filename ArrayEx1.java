import java.util.*;
class ArrayEx1
{
	private Scanner scan; // # you need to understand what is member variable. google it pls
	
	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		String subject[] = {"국", "영", "수"};
		int student = scan.nextInt();
		int ar[][]  = new int[student][5];
		int i,j;
		
		
		for ( i=0; i <ar.length ;i++ ) {
			System.out.println((i+1)+"번 학생 데이터 입력>");
		
// 			for (j =0;j<ar[i].length-2 ;j++ ) { // # nice job bro
			for (j =0;j<subject.length ;j++ ) { // # but how about this
				System.out.println(subject[j]);
				ar[i][j] = scan.nextInt();
			}
			
			ar[i][ar[i].length-1]+=ar[i][j]; // # nice job bro
// 			ar[i][ar[i].length] = ar[i][ar[i].length-1]/3; // # nice job bro
			ar[i][ar[i].length] = ar[i][ar[i].length-1]/subject.length; // # but how about this
		}

		System.out.println("======================");
// 		System.out.println("번호   국      영      수    총점   평균");
		System.out.println("번호\t국\t영\t수\t총점\t평균"); // # how about this
		for ( i = 0; i<ar.length ; i++ ) {
			System.out.print((i+1)+"\t");
			
			for (j=0; j <ar[i].length ; j++) {
				System.out.print(ar[i][j]+"\t");
			}
			
			System.out.println();
		}
	}
}

/*
[실행예]
1번 학생 데이터 입력>
국어: 100
영어: 100
수학: 100
2번 학생 데이터 입력>
국어: 100
영어: 100
수학: 100
3번 학생 데이터 입력>
국어: 100
영어: 100
수학: 100


=================================
번호   국어    영어		수학	총점   평균 
1번    100		100		100		300		100.0
2번    100		100		100		300		100.0
3번    100		100		100		300		100.0
___________________________________________-
평균    100		100		100

가로 각 학생
세로 각 과목의 평균
int 변수 하나와 이차원 배열 
인원수가 늘어나도 계산이 되도록 
*/
