package day29_Methods;

public class MethodsWithParameter {

    public static void calculateAge(int birthYear, int currentYear){
        if (birthYear<currentYear){
            System.out.println("Your age is: " + (currentYear-birthYear));
        }else{
            System.err.println("Invalid age!");
        }
    }

    public static void main(String[] args) {

        calculateAge(1987,2020);

    }
}
