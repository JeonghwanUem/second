package const_0929_ex221_q1;

public class MathTest {

	public static void main(String[] args) {
			
		
/*		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Math.PI);*/
		int i,j=0;
		int lotto[] = new int [6];
		double num;
		double number[] = new double[6];
		
	/*	num = Math.sqrt(9);
		System.out.println(num);
		
		
		num= Math.random();//1�̸��� ������ ���� 0<=x<1
		System.out.println(num);
		System.out.println((int)(num*101));//0<=X<=100���ϴ� ������ ������ŭ ���ϰ� �Ҽ��� �ڸ��� �߶󳻸� ���ϴ� ���� ���� ������
		System.out.println((int)(num*10));//0<=X<10
		System.out.println((int)(num*100)+1);//1<=X<=100
		*/
		num= Math.random();
		
		for (i=0; i< lotto.length; i++){ 	
			
			number[i] = Math.random();
		
			lotto[i] = ((int)(number[i]*45)+1);

			if (i==0){
				
				System.out.println(lotto[i]+" ");
		}
						
			if (i>0){
			
				for (j =0; j< i; j++){	
		
					if (lotto[i]==lotto[j]){
		
				break;
		}
		
		}	
			System.out.println(lotto[i]+" ");
		}
			
		}	
		
}
}
		
		
	


/*�ζ� ��ȣ ������ �ߺ��ȵǰ� ���������� ������[1,43,2,44,23,11]
 - 1~45������ ���� 6�� ���� ����
 - �ѹ� ���� ���ڰ� �� ������ �ٽ�,
 */
 