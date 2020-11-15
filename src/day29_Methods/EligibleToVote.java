package day29_Methods;

public class EligibleToVote {

    public static void main(String[] args) {

    }

    public static void eligible(int age, String citizenship){
        if (citizenship.equalsIgnoreCase("USA")){
            if (age>=18){
                System.out.println("Congratulations! You are eligible to vote!");
            }else{
                System.err.println("You must grown up!");
            }
        }else{
            System.err.println("You must be a US citizen!");
        }
    }
}
