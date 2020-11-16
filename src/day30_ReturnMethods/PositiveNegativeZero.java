package day30_ReturnMethods;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        positiveNegativeZero(-20);
        positiveNegativeZero(0);
        positiveNegativeZero(78);

    }

    public static void positiveNegativeZero(int number){
        if (number>0){
            System.out.println(number + " is positive");
        }else if (number<0){
            System.out.println(number + " is negative");
        }else{
            System.out.println(number + " is zero");
        }
    }
}
