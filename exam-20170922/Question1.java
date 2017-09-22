import java.util.*;
class Question1
{
  

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int kor, eng, math, total;
		double avg;
		
		System.out.print("국어 점수: ");
		kor = scan.nextInt();
		System.out.print("영어 점수: ");
		eng = scan.nextInt();
		System.out.print("수학 점수: ");
		math = scan.nextInt();
		
		total =kor+eng+math; 
		avg = (double)(kor+eng+math)/3;
		
		System.out.println("국어:"+ kor+" 영어: "+eng+" 수학: "+math+" 총점:"+total+" 평균: "+avg);


		
	}
}
