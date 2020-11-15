package day29_Methods;

public class MethodsWithoutParameter {

    public static void printOddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

        public static void printEvenNumbers() {
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        System.out.println("Odd numbers:");
        printOddNumbers();
        System.out.println("Even numbers:");
        printEvenNumbers();
    }
}
