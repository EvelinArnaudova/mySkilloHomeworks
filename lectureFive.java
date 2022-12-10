import java.util.*;
import java.util.LinkedList;
import java.io.*;

public class lectureFive {
    public static void main(String[] args) {

    }

    public static void SumArrays() {
        int[] evenNumbers = {2, 4, 6};
        int[] oddNumbers = {3, 5, 7};

        System.out.println(evenNumbers[1] + oddNumbers[2]);
    }

    public static void Print2DMatrix() {
        int[][] sum = new int[4][2];
        sum[0][0] = 10;
        sum[0][1] = 11;
        sum[1][0] = 12;
        sum[1][1] = 13;
        sum[2][0] = 14;
        sum[2][1] = 15;
        sum[3][0] = 16;
        sum[3][1] = 17;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(sum[i][j]);
            }
        }
    }

    public static void Enter2DMatrix() {

        int row, column, i = 0, j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        column = sc.nextInt();

        int[][] table = new int[row][column];
        System.out.println("Enter numbers in the rows");

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++)
                table[i][j] = sc.nextInt();
            System.out.println("Enter numbers in the columns: ");
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++)
                System.out.println("The numbers in the table are: " + table[i][j]);
        }
        System.out.println();
    }

    public static void FindBiggestNum() {

        /*ArrayList<Double> myNumbers = new ArrayList<>();
        myNumbers.add(3.4);
        myNumbers.add(6.8);
        myNumbers.add(9.8);

        if (myNumbers.get(0) > myNumbers.get(1) && myNumbers.get(0) > myNumbers.get(2)) {
            System.out.println(myNumbers.get(0) + " is the biggest number");
        } else if (myNumbers.get(1) > myNumbers.get(0) && myNumbers.get(1) > myNumbers.get(2)) {
            System.out.println(myNumbers.get(1) + " is the biggest number");
        } else if (myNumbers.get(2) > myNumbers.get(0) && myNumbers.get(2) > myNumbers.get(1)) {
            System.out.println(myNumbers.get(2) + " is the biggest number");
        }*/

        int[] myNumbers = {3, 6, 9, 34};
        int bigNum = myNumbers[0];

        for (int i = 0; i < myNumbers.length; i++) {
            bigNum = Math.max(bigNum, myNumbers[i]);
        }
        System.out.println("The biggest number is: " + bigNum);
    }

    public static void ReverseLinkedList() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        System.out.println("Increasing order: " + myList);

        Iterator decr = myList.descendingIterator();
        System.out.println("Decreasing order: ");
        while (decr.hasNext()) {
            System.out.println(decr.next());
        }
    }

    public static void SumDiagonal(int[][] matrix, int n) {

           /* int[][] matrix = {
                    {1, 2, 3, 4,},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            SumDiagonal(matrix, 4);*/

        int pD = 0, sD = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    pD += matrix[i][j];
                if ((i + j) == (n - 1))
                    sD += matrix[i][j];
            }
        }
        System.out.println("The sum of the primary diagonal is: " + pD);
        System.out.println("The sum of the secondary diagonal is: " + sD);

    }
}






