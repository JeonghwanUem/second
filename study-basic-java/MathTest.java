package const_0929_ex221_q1;

public class MathTest {

    public static void main(String[] args) {

        int size = 6;
        int maxNum = 45;
        int padding = 1;

        int lotto[] = new int[size];
        int tempLotto;

        int count = 0;
        boolean isValid;

        while(count < size) {
            // initialize validation
            isValid = true;

            // create temp
            tempLotto = ((int) (Math.random()*maxNum) + padding);

            // check validation
            for(int lottoNum : lotto) {
                if(lottoNum == tempLotto) {
                    isValid = false;
                }
            }

            if(isValid) {
                // insert
                lotto[count] = tempLotto;

                // increment
                count++;
            }
        }

        // print out
        for(int lottoNum : lotto) {
            System.out.println(lottoNum+" ");
        }
    }

}

/*로또 번호 생성기 중복안되고 이중포문과 이프형[1,43,2,44,23,11]
 - 1~45까지의 숫자 6개 랜덤 생성
 - 한번 나온 숫자가 또 나오면 다시,
 */
