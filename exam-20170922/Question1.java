import java.util.*;
class Question1
{
  

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int kor, eng, math, total;
		double avg;
		
		System.out.print("���� ����: ");
		kor = scan.nextInt();
		System.out.print("���� ����: ");
		eng = scan.nextInt();
		System.out.print("���� ����: ");
		math = scan.nextInt();
		
		total =kor+eng+math; 
		avg = (double)(kor+eng+math)/3;
		
		System.out.println("����:"+ kor+" ����: "+eng+" ����: "+math+" ����:"+total+" ���: "+avg);


		
	}
}
