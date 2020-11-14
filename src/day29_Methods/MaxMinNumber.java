package day29_Methods;

public class MaxMinNumber {

    public static void maxMinNumber(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int each : arr){
            if (each > max) {
                max = each;
            }
            if (each < min){
                min = each;
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

    public static void uniqueNumber(int[] arr){
        for (int each1 : arr){
            int frequency = 0;
            for (int each2 : arr){
                if (each1==each2){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(each1);
            }
        }
    }


    public static void main(String[] args) {

      int[] numbers = {10, 20, 30, 40, 50, 60, 10, 20, 30, 40};

        maxMinNumber(numbers);
        uniqueNumber(numbers);


    }

}
