package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        int[] scores = new int[1];

        scores[0] = 10;

        System.out.println(Arrays.toString(scores));
    }
}
