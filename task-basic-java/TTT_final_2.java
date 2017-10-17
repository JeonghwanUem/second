
import java.util.*;

class TTT_final_2 {
    public static void main(String[] args) {
        String someString = "abcdefg1234";
        String compareString = "abcdefg";
        compareString = compareString + "1234";
        System.out.println("someString : " + someString);
        System.out.println("compareString : " + compareString);
        if(someString == compareString) {
            System.out.println("same String");
        }


        Scanner scan = new Scanner(System.in);

        int h, y;

        int i = 0, j, z, n, x = 0;

        boolean turn = false;

        String turns = "X";

        String line;

        String[] board = new String[8];

        String[][] ar = {{"0", "1", "2"}, {"3", "4", "5"}, {"6", "7", "8"}};

        boolean playing = true;

        while (playing)

        {
            if (turn)

            {

                System.out.println("it's O's turn, put O on the board");

                h = scan.nextInt();

                y = scan.nextInt();

            } else

            {
                System.out.println("it's X's turn, put X on the board");

                h = scan.nextInt();

                y = scan.nextInt();


            }

            turn = !turn;


            for (i = 0; i < 3; i++)

            {

                for (j = 0; j < 3; j++)

                {
                    System.out.print(ar[i][j]);

                    // if (ar[i][j] == "3" || ar[i][j] == "6")
                    // # you don't need to use String object.
                    // # it will cause some bad behavior.
                    // # just use j variance
                    if (j == 2)
                    {
                        System.out.print("\n");
                    }

                    if (turn)

                    {

                        ar[h][y] = "X";
                    } else

                        ar[h][y] = "O";
                }

            }

            System.out.println(" ");


        }
    }
}
