import java.util.*;

class Question5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int option = 0, i, j;

        String phoneBook[][] = new String[5][2];

        String name;

        int inputNumber = 0;


        while (true)

        {
            System.out.print("[전화번호부]\n1.입력\n2.전체출력\n3.검색\n0.종료\n선택: ");

            option = scan.nextInt();


            switch (option) {

                case 1:

                    if (inputNumber == 5)

                    {

                        System.out.println("더 이상 번호를 저장할 수 없습니다.");

                        break;

                    }

                    System.out.print("[새 전화번호 등록]\n이름:");

                    phoneBook[inputNumber][0] = scan.next();


                    System.out.print("전화번호:");

                    phoneBook[inputNumber][1] = scan.next();

                    inputNumber++;

                    break;


                case 2:

                    System.out.println("[전체 전화번호 출력]");

                    for (i = 0; i < inputNumber; i++) {
                        String cName = "";
                        String pNumber = "";
                        for ( j = 0; j<2 ; j++ )  {
                            if(j == 0) {
                                cName = phoneBook[i][j];
                            } else {
                                pNumber = phoneBook[i][j];
                            }
                        }
                        System.out.println("이름: " + cName + "  " + "전화번호: " + pNumber);
                    }

                    break;

                case 3:


                    System.out.print("[전화번호 검색]\n검색할 이름: ");

                    name = scan.next();

                    for (i = 0; i < inputNumber; i++)

                    {
                        if (name.equals(phoneBook[i][0]))

                            System.out.print("검색된 전화번호 :" + phoneBook[i][1] + "\n");

                    }
                    break;

                case 0:

                    System.out.print("프로그램을 종료합니다.");

                    return;
            }


        }

    }
}
