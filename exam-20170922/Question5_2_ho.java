import java.util.*;

class Question5_2_ho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int option = 0, i, j;

        String phoneBook[][] = new String[5][2];

        String name;

        int inputNumber = 0;


        while (true)

        {
            System.out.print("[��ȭ��ȣ��]\n1.�Է�\n2.��ü���\n3.�˻�\n0.����\n����: ");

            option = scan.nextInt();


            switch (option) {

                case 1:

                    if (inputNumber == 5)

                    {

                        System.out.println("�� �̻� ��ȣ�� ������ �� �����ϴ�.");

                        break;

                    }

                    System.out.print("[�� ��ȭ��ȣ ���]\n�̸�:");

                    phoneBook[inputNumber][0] = scan.next();


                    System.out.print("��ȭ��ȣ:");

                    phoneBook[inputNumber][1] = scan.next();

                    inputNumber++;

                    break;


                case 2:

                    System.out.println("[��ü ��ȭ��ȣ ���]");

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
                        System.out.println("�̸�: " + cName + "  " + "��ȭ��ȣ: " + pNumber);
                    }

                    break;

                case 3:


                    System.out.print("[��ȭ��ȣ �˻�]\n�˻��� �̸�: ");

                    name = scan.next();

                    for (i = 0; i < inputNumber; i++)

                    {
                        if (name.equals(phoneBook[i][0]))

                            System.out.print("�˻��� ��ȭ��ȣ :" + phoneBook[i][1] + "\n");

                    }
                    break;

                case 0:

                    System.out.print("���α׷��� �����մϴ�.");

                    return;
            }


        }

    }
}

