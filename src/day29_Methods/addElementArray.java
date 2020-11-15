package day29_Methods;

import java.util.Arrays;

public class addElementArray {

    public static void main(String[] args) {

        int[] array = {12, 11, 10, 9, 8};
        int n = 7;
        addElementAnArray(array, n);

    }

    public static void addElementAnArray(int[] arr, int number){
        int[] newArray = new int[arr.length+1];
        int i = 0;
        for (int each : arr){
            newArray[i] = each;
            i++;
        }
        newArray[newArray.length-1] = number;

        System.out.println(Arrays.toString(newArray));
    }
}
/*
create a method that can add element into array and prints out
                addElement( {1,2,3}, 4)
                output:
                    {1,2,3,4}
 */