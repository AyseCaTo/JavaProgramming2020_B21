package day29_Methods;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        int[] a = {-1, 0, 1, 2, 3};
        int[] b = {4, 5, 6, 7, 8, 9};
        combineArrays(a,b);
    }

    public static void combineArrays(int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length+ arr2.length];

        int i = 0;

        for (int each1 : arr1){
            newArray[i] = each1;
            i++;
        }

        for (int each2 : arr2){
            newArray[i] = each2;
            i++;
        }

        System.out.println(Arrays.toString(newArray));
    }
}
/*
 arr1 = {1,2,3,4}
        arr2 ={5,6,7}
        {1,2,3,4,5,6,7}
 */